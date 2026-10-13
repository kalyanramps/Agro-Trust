package com.example.product_blockchain_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;

public class Product_Details extends AppCompatActivity {
    Button b1,b2,b3;
    TextView tv,tv1;
    ImageView imageView;
    public static String result="",itemid="",itname="",itdesc="",itmanu="",itprice="",ittype="",date="",time="";
    Intent bk;
    String seller_id="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        imageView = findViewById(R.id.imageView);

        tv1 = findViewById(R.id.tv1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        bk=new Intent(this, MainActivity.class);



        tv1.setText("ItemId  \t"+itemid+"\nName \t"+itname+"\n"+itdesc+"\nManufacture \t"+itmanu+"\nPrice \t"+itprice+"\nType \t"+ittype+"\nDate \t"+date+"\nTime \t"+time);



        Picasso.with(getApplicationContext())
                .load(Global.url+"i"+"_"+itmanu+"_"+itemid+".png")
                .into(imageView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    verify_seller_details();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(bk);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    buy();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void verify_seller_details() throws IOException, JSONException {
        URL url = new URL(Global.url+ "verify_seller_details");
        JSONObject jsn = new JSONObject();

        jsn.put("lat",GPSTracker.latitude+"");
        jsn.put("lon",GPSTracker.longitude+"");
        jsn.put("item_id",itemid);
        jsn.put("manufacturer_id",itmanu);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().build();
        StrictMode.setThreadPolicy(policy);
        String response = null;
        response = HttpClientConnection.getData(url, jsn);

        if(response.endsWith("null"))
        {

            response=response.substring(0,response.length()-4);
        }
        Toast.makeText(getApplicationContext(),response,Toast.LENGTH_LONG).show();
        Log.d("response",response);
        if(response.startsWith("Valid") || response.startsWith("Invalid")) {
            String a[] = response.split("#");

            DecimalFormat df=new DecimalFormat("0.0");
            tv1.setText(a[0] + "\nSeller Id  \t" + a[1] + "\nName \t" + a[2] + "\nEmail \t" + a[3] + "\nMobile \t" + a[4] + "\nAddress \t" + a[5] + "\nDistance \t" + df.format(Double.parseDouble(a[8]))+" KM");
            seller_id=a[1];
        }
        else{

            tv1.setText(response);
        }


    }

    public void buy() throws IOException, JSONException {
        URL url = new URL(Global.url+ "buy");
        JSONObject jsn = new JSONObject();


        jsn.put("consumer",MainActivity.user);
        jsn.put("item_id",itemid);
        jsn.put("seller_id",seller_id);
        jsn.put("itprice",itprice);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().build();
        StrictMode.setThreadPolicy(policy);
        String response = null;
        response = HttpClientConnection.getData(url, jsn);

        if(response.endsWith("null"))
        {

            response=response.substring(0,response.length()-4);
        }
        Toast.makeText(getApplicationContext(),response,Toast.LENGTH_LONG).show();

            tv1.setText(response);



    }
}