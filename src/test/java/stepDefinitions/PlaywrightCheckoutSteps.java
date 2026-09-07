package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import pages.PlaywrightCheckoutPage;

public class PlaywrightCheckoutSteps {

    private final Page page = Hooks.page;
    private final PlaywrightCheckoutPage checkoutPage = new PlaywrightCheckoutPage(page);

    @Given("the user clicks the Checkout button")
    public void the_user_clicks_the_checkout_button() {
        checkoutPage.clickCheckoutButton();
    }

    @When("the user fills out the {string} form with {string}, {string}, and {string}")
    public void the_user_fills_out_the_form_with_and(String formTitle, String firstName, String lastName,
            String postalCode) {
        checkoutPage.fillFirstName(firstName);
        checkoutPage.fillLastName(lastName);
        checkoutPage.fillPostalCode(postalCode);
    }

    @When("the user clicks the Continue button")
    public void the_user_clicks_the_continue_button() {
        checkoutPage.clickContinueButton();
    }

    @Then("the user should be navigated to the Overview page to see the total price")
    public void the_user_should_be_navigated_to_the_overview_page_to_see_the_total_price() {
        String currentUrl = page.url();
        Assert.assertTrue(currentUrl.contains("checkout-step-two.html"));
    }

    @When("the user clicks the Finish button")
    public void the_user_clicks_the_finish_button() {
        checkoutPage.clickFinishButton();
    }

    @Then("the user should see the {string} message")
    public void the_user_should_see_the_message(String expectedMessage) {
        String actualMessage = checkoutPage.getCompleteHeaderText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}