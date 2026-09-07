# 🚀 Web Automation Framework - SauceDemo E2E Testing (Selenium & Playwright)

## 📖 Description

This repository features a robust web automation test framework designed for the SauceDemo (Swag Labs) platform. The project focuses on automating critical end-to-end (E2E) business flows, ensuring application stability, and providing fast feedback loops through a Behavior-Driven Development (BDD) approach using both Selenium and Playwright implementations.

## 🎯 Target Application

* **Website:** Swag Labs (SauceDemo)
* **Description:** A sample e-commerce web application provided by Sauce Labs for testing purposes. User credentials for the automation flow are standard sandbox accounts.

## 🛠️ Tech Stack & Architecture

This framework is built using industry-standard tools and best-practice design patterns:
* **Language:** Java
* **Automation Tools:** Playwright (Primary migration) & Selenium WebDriver (Legacy support)
* **Testing Framework:** TestNG
* **Build & Dependency Management:** Gradle
* **BDD Approach:** Cucumber (Gherkin syntax)
* **Design Patterns:** Page Object Model (POM) to maximize maintainability, readability, and element reusability.

## 🎯 Automation Scope

### ✅ What IS Automated (In Scope)
* **User Authentication:** Successful login, validation, and secure logout via the hamburger menu.
* **Cart Management:** Adding products, verifying badge counts, and validating items inside the shopping cart.
* **Checkout Flow:** Completing the checkout form, verifying order overview, total price, and successful order completion.
* **Regression & Smoke Testing:** Quick validation of critical paths using Cucumber feature files.

### ❌ What IS NOT Automated (Out of Scope)
* **UI/UX & Visual Testing:** Aesthetic checks, alignment, and color contrasts are left for manual exploration or specialized visual tools.
* **CAPTCHAs / 2FA:** Security mechanisms designed to block bots are bypassed by design (or disabled in dedicated QA test environments).
* **Exploratory Testing:** Ad-hoc and intuitive test scenarios aiming to find hidden edge cases.

## 📂 Project Structure

The project follows a modular architecture to separate test logic from page mechanics:
* `src/test/java/pages`: Contains Playwright and Selenium Page Object classes.
* `src/test/java/stepDefinitions`: Maps Gherkin steps to automation actions (with decoupled step definitions to prevent duplicates).
* `src/test/java/runners`: TestNG execution runners configured for Cucumber features.
* `src/test/resources/features`: `.feature` files written in Gherkin syntax defining the business behavior (Login, Logout, Cart, Checkout).

## ⚙️ Setup and Execution

### Prerequisites
* Java JDK 11 or higher installed.
* Git installed.

### How to Run the Tests

1. Clone this repository:
   ```bash
   git clone [https://github.com/Jvilla29/saucedemo-selenium-cucumber-gradle.git](https://github.com/Jvilla29/saucedemo-selenium-cucumber-gradle.git)
   Navigate to the project directory:

Bash
cd saucedemo-selenium-cucumber-gradle
Run the test suite via Gradle (Executes the Playwright suite by default):

Bash
gradle clean test
🔄 Switching Between Playwright and Selenium Execution
To avoid DuplicateStepDefinitionException conflicts between engines during execution:

For Playwright: Ensure Playwright step definitions (Playwright*Steps.java) are active and Selenium steps are commented out.

For Selenium: Comment out the Playwright step definitions and uncomment the original Selenium step definitions (*Steps.java).

📊 Test Reports
After a successful (or failed) test execution, the automation framework generates a detailed HTML report using Cucumber.
You can view the results by opening the following file in your preferred web browser:
target/cucumber-reports.html

Author: Jvilla29 - Automation QA Engineer
