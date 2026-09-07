package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;
import pages.CheckoutPage;
import pages.CheckoutCompletePage;

public class CheckoutSteps {

    CartPage cartPage = new CartPage(Hooks.getDriver());
    CheckoutPage checkoutPage = new CheckoutPage(Hooks.getDriver());
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(Hooks.getDriver());

    // @Given("the user clicks the Checkout button")
    // public void the_user_clicks_the_checkout_button() {
    // cartPage.clickCheckout();
    // }

    // @When("the user fills out the {string} form with {string}, {string}, and
    // {string}")
    // public void the_user_fills_out_the_form_with_and(String formName, String
    // firstName, String lastName,
    // String postalCode) {
    // checkoutPage.enterPersonalInformation(firstName, lastName, postalCode);
    // }

    // @When("the user clicks the Continue button")
    // public void the_user_clicks_the_continue_button() {
    // checkoutPage.clickContinue();
    // }

    // @Then("the user should be navigated to the Overview page to see the total
    // price")
    // public void
    // the_user_should_be_navigated_to_the_overview_page_to_see_the_total_price() {
    // Assert.assertTrue(checkoutPage.isTotalPriceDisplayed(), "The total price is
    // not visible on the Overview page");
    // }

    // @When("the user clicks the Finish button")
    // public void the_user_clicks_the_finish_button() {
    // checkoutPage.clickFinish();
    // }

    // @Then("the user should see the {string} message")
    // public void the_user_should_see_the_message(String expectedMessage) {
    // String actualMessage = checkoutCompletePage.getCompleteMessage();
    // Assert.assertEquals(actualMessage, expectedMessage, "The thank you message
    // does not match");
    // }
}
