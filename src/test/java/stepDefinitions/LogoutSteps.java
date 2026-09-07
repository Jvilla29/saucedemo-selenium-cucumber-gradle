package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.InventoryPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LogoutSteps {

    WebDriver driver = Hooks.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);

    // @Given("the user successfully login with valid credentials")
    // public void theUserSuccessfulLyloginWithValidCredentials() {

    // driver.get("https://www.saucedemo.com/");

    // loginPage = new LoginPage(driver);
    // inventoryPage = new InventoryPage(driver);

    // loginPage.enterUsername("standard_user");
    // loginPage.enterPassword("secret_sauce");
    // loginPage.clickLoginButton();
    // }

    // @And("I am a logged-in user on the inventory page")
    // public void iAmALoggedInUserOnTheInventoryPage() {
    // String actualUrl = driver.getCurrentUrl();
    // Assert.assertTrue(actualUrl.contains("inventory"));
    // }

    // @When("I click on the hamburger menu")
    // public void iClickOnTheHamburgerMenu() {
    // inventoryPage.clickHamburgerMenu();
    // }

    // @And("I click on the Logout option")
    // public void iClickOnTheLogoutOption() {
    // inventoryPage.clickLogout();
    // }

    // @Then("the user should be redirected back to the login page")
    // public void theUserIsOnTheSauceDemoLoginPage() {
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    // wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/"));

    // String actualUrl = driver.getCurrentUrl();
    // Assert.assertEquals(actualUrl, "https://www.saucedemo.com/");
    // }
}
