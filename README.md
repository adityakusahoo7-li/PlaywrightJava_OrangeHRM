# PlaywrightJava_OrangeHRM
🚀 Automated testing framework for the OrangeHRM portal built using Playwright Java, TestNG/JUnit, and ExtentReports. Features robust locators, cross-browser testing, and dynamic HTML reporting.
# OrangeHRM Test Automation Framework (Playwright Java)

This repository contains a robust, scalable test automation framework designed to test the **OrangeHRM** web application. It leverages **Playwright Java** for lightning-fast, reliable browser automation alongside structured test execution and rich reporting tools.

## 🛠️ Tech Stack & Tools
* **Language:** Java 17+
* **Automation Tool:** [Playwright Java](https://playwright.dev)
* **Test Runner:** TestNG / JUnit 5
* **Reporting:** ExtentReports (with Base64 embedded screenshots)
* **Build Tool:** Maven

## ✨ Features
* **Cross-Browser Testing:** Configured to run seamlessly across Chromium, Firefox, and WebKit.
* **Modern Locators:** Uses resilient XPaths and native Playwright locators for elements like the OrangeHRM Sidebar Dashboard.
* **Failure Capture:** Automatically captures full-page screenshots upon test failure and attaches them directly to the test report.
* **Headless/Headed Mode:** Flexible execution via configuration flags or CLI parameters.

## 🚀 Getting Started

### Prerequisites
Ensure you have the following installed on your local machine:
* JDK 17 or higher
* Apache Maven 3.8+
* An IDE (IntelliJ IDEA or Eclipse)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com
   ```
2. Navigate into the project directory:
   ```bash
   cd YOUR_REPOSITORY_NAME
   ```
3. Install dependencies and system browser requirements:
   ```bash
   mvn clean install
   mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install-deps"
   ```

## 🏃 Running Tests
Execute all automated test suites directly from the terminal using Maven:
```bash
mvn test
```

## 📊 Test Reports
After test execution completes, the results are compiled into an interactive HTML report.
* **Location:** `target/ExtentReports/extent.html` (or your custom reports directory)
* **Features:** Includes test status logs, execution duration, and embedded failure screenshots.
