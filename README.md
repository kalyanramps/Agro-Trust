# 🌱 Agro-Trust — Blockchain-Based Agricultural Supply Chain Management

### 🌾 Building Trust, Transparency & Traceability from Farm to Consumer

Agro-Trust is an **IoT- and blockchain-powered agricultural supply chain management system** designed to improve transparency, traceability, and trust throughout the agricultural product lifecycle. The platform connects farmers, retailers, transporters, and consumers through a digital ecosystem that combines modern web technologies, mobile applications, IoT-based environmental monitoring, and blockchain-based product verification.

By integrating **React, Spring Boot, MySQL, Android, Python, and Ethereum smart contracts**, Agro-Trust aims to make agricultural supply chains more transparent, accountable, and reliable.

---

## 📌 Table of Contents

- [🌟 Project Overview](#-project-overview)
- [🎯 Objectives](#-objectives)
- [✨ Key Features](#-key-features)
- [🏗️ System Architecture](#️-system-architecture)
- [🧩 Project Modules](#-project-modules)
- [🛠️ Technology Stack](#️-technology-stack)
- [🔄 Workflow](#-workflow)
- [📂 Project Structure](#-project-structure)
- [⚙️ Installation and Setup](#️-installation-and-setup)
- [🔐 Security Considerations](#-security-considerations)
- [🚀 Future Enhancements](#-future-enhancements)
- [🤝 Contributing](#-contributing)
- [👨‍💻 Author](#-author)
- [📄 License](#-license)

---

## 🌟 Project Overview

Traditional agricultural supply chains can face challenges such as limited product visibility, fragmented records, counterfeit products, and difficulties verifying the origin and handling history of agricultural goods.

Agro-Trust addresses these challenges through a unified platform that supports digital product records, role-based access, product tracking, and blockchain-backed verification.

The system combines a web-based interface for supply chain participants, a backend service for application logic and data management, an Android application for mobile access, and a Python component for interacting with blockchain-based product tracking.

### 🌍 Our Vision

To create a more transparent and trustworthy agricultural ecosystem in which supply chain participants can access reliable product information and consumers can make more informed purchasing decisions.

---

## 🎯 Objectives

- 🌾 Improve transparency across the agricultural supply chain.
- 🔗 Enable blockchain-based product traceability and verification.
- 📱 Provide convenient mobile access through an Android application.
- 📦 Maintain digital records of agricultural products and their movement.
- 🌡️ Support environmental monitoring through IoT sensor integration.
- 🔍 Enable QR-code-based product identification and verification.
- 🔐 Protect application resources through authentication and role-based access control.
- 🤝 Strengthen trust and accountability among farmers, retailers, transporters, and consumers.

---

## ✨ Key Features

### 🔗 Blockchain-Based Product Tracking
- Maintain product traceability records using blockchain technology.
- Use Ethereum smart contracts for supported tracking and verification operations.
- Connect application workflows to blockchain functionality through Python.
- Support verification of product information and tracking history.

### 📱 Android Application
- Provide a mobile interface for supported Agro-Trust operations.
- Make relevant product and supply chain information accessible on mobile devices.
- Support integration with backend services and product verification workflows.

### 💻 React Frontend
- Provide a user-friendly web interface for interacting with the platform.
- Present relevant product and supply chain information.
- Connect with backend APIs to retrieve and submit application data.

### ⚙️ Spring Boot Backend
- Implement backend business logic and REST API endpoints.
- Manage application data and database interactions.
- Support authentication, authorization, and role-based access control.
- Coordinate application workflows between the frontend and data layer.

### 🌡️ IoT-Based Environmental Monitoring
- Integrate supported sensors to collect environmental readings.
- Use hardware such as ESP8266/NodeMCU and DHT11 or gas sensors, where configured.
- Support monitoring of environmental conditions during relevant stages of the supply chain.
- Enable sensor readings to be associated with tracking workflows where implemented.

### 📲 QR-Code-Based Verification
- Associate a QR code with a product or its tracking record.
- Allow supported applications to retrieve product information through QR-based identification.
- Help users verify available product details and traceability records.

### 🛡️ Access Control
- Apply role-based permissions for supported user categories.
- Protect restricted application operations.
- Use token-based authentication where configured.

---

## 🏗️ System Architecture

Agro-Trust is organized into four primary software components, with database, blockchain, and IoT integrations supporting the overall workflow.

```text
                    🌱 AGRO-TRUST PLATFORM
                              |
              +---------------+---------------+
              |               |               |
       💻 React Web      📱 Android       📦 Product
         Frontend         Application      Tracking
              |               |               |
              +---------------+---------------+
                              |
                       ⚙️ Spring Boot
                        REST API Layer
                              |
                 +------------+------------+
                 |                         |
             🗄️ MySQL              🔗 Python Blockchain
              Database              Integration Layer
                                           |
                                    ⛓️ Ethereum
                                    Smart Contracts

                       🌡️ IoT Sensor Layer
                  ESP8266 / NodeMCU / Sensors
```

*Note: This is a conceptual architecture. The exact communication paths depend on the integrations implemented in the project.*

---

## 🧩 Project Modules

### 1. 💻 Web Frontend — React

**Directory:** `AGRO_TRUST_FRONTEND/`

The frontend provides the web interface through which users interact with Agro-Trust.

**Responsibilities**
- Render the platform's user interface.
- Display product and supply chain information.
- Communicate with backend REST APIs.
- Support the workflows implemented for the platform's user roles.
- Present product tracking and verification information where integrated.

**Technologies**
- React
- JavaScript
- HTML5
- CSS3
- Node.js and npm for the development environment

### 2. ⚙️ Backend — Spring Boot

**Directory:** `AGRO_TRUST_BACKEND/`

The backend provides the application services and business logic required by the platform.

**Responsibilities**
- Expose REST APIs for supported application features.
- Process incoming requests and return responses.
- Manage product and supply chain data.
- Integrate with MySQL for persistent storage.
- Apply authentication and authorization rules.
- Coordinate product-related operations and external integrations where implemented.

**Technologies**
- Java
- Spring Boot
- Spring Web
- Spring Security
- MySQL
- Maven, if configured in the project

### 3. 📱 Android Application

**Directory:** `AGRO_TRUST_App/`

The Android application provides mobile access to supported Agro-Trust functionality.

**Responsibilities**
- Provide a mobile user interface.
- Connect to backend services where configured.
- Support relevant product information and tracking workflows.
- Facilitate mobile access to supported verification features.

**Technologies**
- Android Studio
- Android SDK
- Java or Kotlin, depending on the implementation
- REST API integration, where configured

### 4. ⛓️ Product Tracking — Python and Blockchain

**Directory:** `Product_Tracking_Blockchain_Py/`

This component supports Python-based interaction with blockchain functionality for product tracking and verification.

**Responsibilities**
- Connect Python code to an Ethereum-compatible blockchain environment.
- Interact with deployed smart contracts.
- Support implemented product tracking or verification operations.
- Bridge application data and blockchain functionality where configured.
- Help retrieve or verify blockchain-backed tracking information.

**Technologies**
- Python
- Web3.py, if used by the implementation
- Ethereum
- Solidity smart contracts
- Ganache and Remix, if used for local development and contract deployment

---

## 🛠️ Technology Stack

| Component | Technologies |
|---|---|
| 🌐 Frontend | React, JavaScript, HTML5, CSS3 |
| ⚙️ Backend | Java, Spring Boot, Spring Web |
| 🔐 Security | Spring Security, JWT where configured |
| 🗄️ Database | MySQL |
| 📱 Mobile | Android Studio, Android SDK |
| ⛓️ Blockchain | Ethereum, Solidity |
| 🐍 Blockchain integration | Python, Web3.py where configured |
| 🧪 Smart contract development | Remix, Ganache where configured |
| 🌡️ IoT | ESP8266/NodeMCU, DHT11 and supported sensors |
| 🛠️ Development tools | Git, GitHub, VS Code, IntelliJ IDEA, Android Studio |

---

## 🔄 Workflow

The following workflow illustrates the intended interaction between the platform components.

1. 🌾 **Product Registration:** A supported user enters agricultural product information through an available application interface.
2. 🗄️ **Data Processing:** The Spring Boot backend validates and processes the submitted information.
3. 💾 **Data Storage:** Relevant application records are stored in MySQL.
4. ⛓️ **Blockchain Interaction:** Supported tracking information is submitted to or retrieved from Ethereum smart contracts through the configured blockchain integration.
5. 🌡️ **Environmental Monitoring:** Connected IoT hardware collects sensor readings where this functionality is configured.
6. 📲 **QR-Code Identification:** A product's QR code can be used to identify its associated tracking record.
7. 🔍 **Product Verification:** Users can view the product information and verification data made available by the implemented system.
8. 🤝 **Supply Chain Transparency:** Authorized participants and consumers can access relevant information according to the permissions and features supported by the platform.

*The precise sequence and availability of each step depend on the implemented application workflows.*

---

## 📂 Project Structure

The repository is organized into four main component directories:

```text
Agro-Trust/
│
├── AGRO_TRUST_FRONTEND/
│   └── React web application
│
├── AGRO_TRUST_BACKEND/
│   └── Spring Boot backend application
│
├── AGRO_TRUST_App/
│   └── Android mobile application
│
├── Product_Tracking_Blockchain_Py/
│   └── Python-based blockchain tracking component
│
├── .gitignore
└── README.md
```

Each component can contain its own source code, configuration, dependencies, and supporting files.

---

## ⚙️ Installation and Setup

### 📋 Prerequisites

Install the tools required for the components you want to run:

- Git
- Java Development Kit (JDK), compatible with the backend project
- Maven, if the backend uses Maven
- Node.js and npm
- Python 3
- Android Studio and the Android SDK
- MySQL Server
- An Ethereum development environment, if required by the blockchain component

### 1. 📥 Clone the Repository

```bash
git clone https://github.com/kalyanramps/Agro-Trust.git
cd Agro-Trust
```

### 2. ⚙️ Configure the Backend

Navigate to the backend directory:

```bash
cd AGRO_TRUST_BACKEND
```

Configure the database connection and other required settings using your local environment or the application's supported configuration files.

For example, a Spring Boot application may use settings similar to:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Use the configuration keys expected by the actual application.

If the project uses Maven and includes `mvnw`, start the backend with:

```bash
mvnw spring-boot:run
```

On Windows Command Prompt, use:

```cmd
mvnw.cmd spring-boot:run
```

Alternatively, if Maven is installed and the project includes a `pom.xml`:

```bash
mvn spring-boot:run
```

### 3. 💻 Configure the React Frontend

Open another terminal and navigate to:

```bash
cd AGRO_TRUST_FRONTEND
```

Install dependencies:

```bash
npm install
```

Configure the backend API URL using the environment variable expected by the frontend.

Start the development server:

```bash
npm run dev
```

If the project uses a different script, check the `scripts` section in `package.json` and use the appropriate command.

### 4. 📱 Run the Android Application

1. Open Android Studio.
2. Select **Open** and choose the `AGRO_TRUST_App` directory.
3. Allow Gradle synchronization to complete.
4. Configure any required backend API URL or environment settings.
5. Select an Android emulator or connect a compatible physical device.
6. Build and run the application.

Ensure the Android application uses a reachable backend address. For example, an Android emulator commonly uses `10.0.2.2` to access services running on the host machine instead of `localhost`.

### 5. 🐍 Set Up Python Product Tracking

Navigate to the Python component:

```bash
cd Product_Tracking_Blockchain_Py
```

Create and activate a virtual environment.

**Windows:**

```bash
python -m venv venv
venv\Scripts\activate
```

**macOS/Linux:**

```bash
python3 -m venv venv
source venv/bin/activate
```

If the project contains a `requirements.txt`, install its dependencies:

```bash
pip install -r requirements.txt
```

Configure the blockchain connection, deployed contract address, and ABI as required by the implementation. Never commit private keys, seed phrases, or sensitive credentials.

Run the appropriate Python entry-point script for your project.

### 6. 🗄️ Configure MySQL

1. Install and start MySQL Server.
2. Create the database required by the backend.
3. Configure the database URL, username, and password.
4. Apply the schema or migrations required by the project.
5. Start the backend and verify that the database connection succeeds.

Use the database name and schema expected by the actual application.

---

## 🔐 Security Considerations

- 🔑 Keep database passwords, API keys, and private keys out of source control.
- 🧾 Use environment variables or an appropriate secrets-management mechanism.
- 🔒 Restrict blockchain signing keys and sensitive administrative operations.
- 🛡️ Enforce backend authorization for protected endpoints.
- 🌐 Configure CORS appropriately for the frontend and backend.
- 📱 Avoid embedding production secrets in the Android application.
- ⛓️ Test smart contracts before deploying them to a public blockchain.
- 🧪 Use test accounts and test networks during development.

**Important:** Blockchain records may be publicly visible and difficult to modify after confirmation. Do not store personal information or confidential business data directly on a public blockchain.

---

## 🚀 Future Enhancements

Potential future improvements include:

- 📍 GPS-enabled tracking of agricultural shipments.
- 🌡️ Enhanced real-time IoT monitoring and alert notifications.
- 📊 Analytics dashboards for supply chain performance.
- 📷 Integrated QR scanning in the mobile application.
- 🔔 Notifications for shipment updates and environmental alerts.
- 🌐 Deployment to a cloud-hosted environment.
- 🧪 Automated testing and continuous integration.
- 📈 Improved product history visualization and verification reports.

These are proposed enhancements and may not be part of the current implementation.

---

## 🤝 Contributing

Contributions, suggestions, and feedback are welcome.

To contribute:

1. Fork the repository.
2. Create a feature branch.
3. Implement and test your changes.
4. Commit your changes with a descriptive message.
5. Open a pull request describing your contribution.

```bash
git checkout -b feature/your-feature-name
git add .
git commit -m "Add: describe your changes"
git push origin feature/your-feature-name
```

---

## 👨‍💻 Author

**Kalyan Ram P S**

🎓 B.E. Information Science and Engineering

💻 Interests: Java Backend Development, Full-Stack Development, Spring Boot, CyberSecurity, Blockchain, and Software Engineering.

🔗 **GitHub:** [@kalyanramps](https://github.com/kalyanramps)

---

## 📄 License

Choose and add an appropriate open-source license before distributing this project publicly. Until a license is added, all rights remain with the copyright holder by default.

---

⭐ If you find Agro-Trust interesting, consider starring the repository and sharing your feedback!

### 🌱 Agro-Trust — Growing Trust Through Technology.
