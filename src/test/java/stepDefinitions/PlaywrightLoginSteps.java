package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import pages.PlaywrightLoginPage;

public class PlaywrightLoginSteps {

    Page page = Hooks.page;
    PlaywrightLoginPage loginPage = new PlaywrightLoginPage(page);

    @Given("the user is on the SauceDemo login page")
    public void the_user_is_on_the_sauce_demo_login_page() {
        page.navigate("https://www.saucedemo.com/");
    }

    @When("the user enters the username {string} and password {string}")
    public void the_user_enters_the_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the inventory page")
    public void the_user_should_be_redirected_to_the_inventory_page() {
        String currentUrl = page.url();
        Assert.assertTrue(currentUrl.contains("inventory"));
    }
}
