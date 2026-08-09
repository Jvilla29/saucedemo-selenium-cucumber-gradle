# 🚀 Web Automation Framework - SauceDemo E2E Testing

## 📖 Description
This repository features a robust web automation test framework designed for the **SauceDemo** (Swag Labs) platform. The project focuses on automating critical end-to-end (E2E) business flows, ensuring application stability, and providing fast feedback loops through a Behavior-Driven Development (BDD) approach.

## 🎯 Target Application
* **Website:** [Swag Labs (SauceDemo)](https://www.saucedemo.com/)
* **Description:** A sample e-commerce web application provided by Sauce Labs for testing purposes. User credentials for the automation flow are standard sandbox accounts.

## 🛠️ Tech Stack & Architecture
This framework is built using industry standard tools and best-practice design patterns:

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build & Dependency Management:** Gradle
* **BDD Approach:** Cucumber (Gherkin syntax)
* **Design Patterns:** Page Object Model (POM) integrated with **Page Factory** to maximize maintainability, readability, and element reusability.

## 🎯 Automation Scope

### ✅ What IS Automated (In Scope)
* **Smoke Testing:** Quick validation of critical paths (e.g., User Authentication, Checkout flow).
* **Regression Testing:** Verifying core functionalities remain unbroken after changes (e.g., Product sorting, Cart persistence).
* **Data-Driven Testing:** Validating standard, locked-out, and problem user profiles with multiple datasets.

### ❌ What IS NOT Automated (Out of Scope)
* **UI/UX & Visual Testing:** Aesthetic checks, alignment, and color contrasts are left for manual exploration or specialized visual tools.
* **CAPTCHAs / 2FA:** Security mechanisms designed to block bots are bypassed by design (or disabled in dedicated QA test environments).
* **Exploratory Testing:** Ad-hoc and intuitive test scenarios aiming to find hidden edge cases.

## 📂 Project Structure

The project follows a modular architecture to separate test logic from page mechanics:

* `src/test/java/pages`: Contains Page Object classes using Page Factory (`@FindBy` annotations).
* `src/test/java/stepDefinitions`: Maps Gherkin steps to Selenium actions.
* `src/test/java/runners`: TestNG execution runners configured for Cucumber features.
* `src/test/resources/features`: `.feature` files written in Gherkin syntax defining the business behavior.

## ⚙️ Setup and Execution

### Prerequisites
* Java JDK 11 or higher installed.
* Google Chrome installed (Selenium Manager automatically handles driver management).
* Git installed.

### How to Run the Tests
1. Clone this repository:
   ```bash
   git clone [https://github.com/Jvilla29/saucedemo-selenium-cucumber-gradle.git](https://github.com/Jvilla29/saucedemo-selenium-cucumber-gradle.git)
   
Navigate to the project directory:
Bash
cd saucedemo-selenium-cucumber-gradle

Run the test suite via Gradle:
Bash
gradle clean test

📊 Test Reports
After a successful (or failed) test execution, the automation framework generates a detailed HTML report using Cucumber, which includes embedded screenshots of every executed step for visual validation.

You can view the results by opening the following file in your preferred web browser:

target/cucumber-reports.html

Author: Jvilla29 - Automation QA Engineer
