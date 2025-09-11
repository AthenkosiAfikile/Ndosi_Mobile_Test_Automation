# 📱 Ndosi Mobile Test Automation

Ndosi Mobile Test Automation is a mobile testing framework designed to validate web and app flows for the **Ndosi Test Automation site** using **Appium + Cucumber BDD + MySQL**.  
It runs tests across **Android (Chrome browser)** and **iOS (Safari browser)**, fetching test data dynamically from a **MySQL database**.

---

## 🚀 Tech Stack
- **Language:** Java (JDK 11+)
- **Framework:** Cucumber BDD
- **Mobile Automation:** Appium Driver
- **Database:** MySQL (Test data stored by `id`)
- **Browser:** Chrome (Android), Safari (iOS)
- **Build Tool:** Maven / Gradle
- **Reports:** Allure Report, Extent Report
- **Version Control:** GitHub

---

## 📂 Project Structure

NdosiMobileTestAutomation/
│── pom.xml # Maven dependencies
│── README.md # Project documentation
│── src/
│ ├── main/java/
│ │ └── utils/ # DriverFactory, DB utility classes
│ └── test/java/
│ ├── runners/ # Cucumber test runner
│ ├── stepdefs/ # Step Definitions (Given/When/Then)
│ ├── pages/ # Page Objects for mobile elements
│ └── utils/ # Hooks, Config
│ └── test/resources/
│ ├── features/ # .feature files
│ └── extent.properties # Extent report config


---

## ⚙️ Setup & Installation

### 1️⃣ Prerequisites
- [Java JDK 21+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/) or Gradle
- [Appium Server](https://appium.io/) installed and running
- [Android Studio](https://developer.android.com/studio) or [Xcode](https://developer.apple.com/xcode/) for emulators/simulators
- MySQL database with `users` table (email, password, id)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/NdosiMobileTestAutomation.git
cd NdosiMobileTestAutomation

```
### Configure Database

db.url=jdbc:mysql://localhost:3306/ndosi
db.user=root
db.password=yourpassword

### 📊 Reports

target/allure-results

### 👨‍💻 Contributors

Athenkosi Afikile Breakfast – Test Automation Engineer

Mentor: Nkosi Cele – Test Lead
