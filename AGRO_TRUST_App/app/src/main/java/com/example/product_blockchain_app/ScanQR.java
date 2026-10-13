package com.example.product_blockchain_app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;

public class ScanQR extends AppCompatActivity {

    private CodeScanner mCodeScanner;
    public static String qr = "", usr = "";
    public static Intent i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);

        i3 = new Intent(this, Product_Details.class);

        if (ContextCompat.checkSelfPermission(ScanQR.this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(ScanQR.this, new String[]{Manifest.permission.CAMERA}, 123);
        } else {
            startScanning();
        }
    }

    private void startScanning() {
        CodeScannerView scannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, scannerView);

        // Use DecodeCallback without directly importing com.google.zxing.Result
        mCodeScanner.setDecodeCallback(result -> runOnUiThread(() -> {
            qr = result.getText();
            Toast.makeText(ScanQR.this, qr, Toast.LENGTH_SHORT).show();

            try {
                get_qr_details();
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
        }));

        scannerView.setOnClickListener(view -> mCodeScanner.startPreview());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 123) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Camera permission granted", Toast.LENGTH_LONG).show();
                startScanning();
            } else {
                Toast.makeText(this, "Camera permission denied", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mCodeScanner != null) {
            mCodeScanner.startPreview();
        }
    }

    @Override
    protected void onPause() {
        if (mCodeScanner != null) {
            mCodeScanner.releaseResources();
        }
        super.onPause();
    }

    public void get_qr_details() throws IOException, JSONException {
        URL url = new URL(Global.url + "verify_qr");
        JSONObject jsn = new JSONObject();
        jsn.put("qr", qr);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String response = HttpClientConnection.getData(url, jsn);

        if (response.endsWith("null")) {
            response = response.substring(0, response.length() - 4);
        }

        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();

        if (response.equalsIgnoreCase("Valid Product")) {
            String[] a = qr.split("##");
            Product_Details.itmanu = a[0];
            Product_Details.itemid = a[1];
            Product_Details.itname = a[2];
            Product_Details.itdesc = a[3];
            Product_Details.itprice = a[4];
            Product_Details.ittype = a[5];
            Product_Details.date = a[6];
            Product_Details.time = a[7];

            startActivity(i3);
        }
    }
}
