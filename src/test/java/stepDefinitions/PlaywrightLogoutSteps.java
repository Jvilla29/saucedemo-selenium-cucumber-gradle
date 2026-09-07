package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import pages.PlaywrightLoginPage;
import pages.PlaywrightLogoutPage;

public class PlaywrightLogoutSteps {
    Page page = Hooks.page;
    PlaywrightLoginPage loginPage = new PlaywrightLoginPage(page);
    PlaywrightLogoutPage logoutPage = new PlaywrightLogoutPage(page);

    @Given("the user successfully login with valid credentials")
    public void theUserSuccessfullyLoginWithValidCredentials() {
        page.navigate("https://www.saucedemo.com/");
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @And("I am a logged-in user on the inventory page")
    public void iAmALoggedInUserOnTheInventoryPage() {
        String actualUrl = page.url();
        Assert.assertTrue(actualUrl.contains("inventory"));
    }

    @When("I click on the hamburger menu")
    public void iClickOnTheHamburgerMenu() {
        logoutPage.clickHamburgerMenu();
    }

    @And("I click on the Logout option")
    public void iClickOnTheLogoutOption() {
        logoutPage.clickLogout();
    }

    @Then("the user should be redirected back to the login page")
    public void theUserIsOnTheSauceDemoLoginPage() {
        page.waitForURL("https://www.saucedemo.com/");
        String actualUrl = page.url();
        Assert.assertEquals(actualUrl, "https://www.saucedemo.com/");
    }
}
