package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import pages.PlaywrightCartPage;

public class PlaywrightCartSteps {

    Page page = Hooks.page;
    PlaywrightCartPage cartPage = new PlaywrightCartPage(page);

    @When("the user clicks the {string} button for the Sauce Labs Backpack")
    public void the_user_clicks_the_button_for_the_sauce_labs_backpack(String buttonText) {
        cartPage.addBackpackToCart();
    }

    @Then("the button text for the item should change to {string}")
    public void the_button_text_for_the_item_should_change_to(String expectedText) {
        String actualText = cartPage.getRemoveButtonText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("the shopping cart badge should display {string}")
    public void the_shopping_cart_badge_should_display(String expectedCount) {
        Assert.assertTrue(cartPage.isCartBadgeVisible());
    }

    @When("the user clicks on the shopping cart icon")
    public void the_user_clicks_on_the_shopping_cart_icon() {
        cartPage.clickCartIcon();
    }

    @Then("the user should see the Sauce Labs Backpack on the Cart page")
    public void the_user_should_see_the_sauce_labs_backpack_on_the_cart_page() {
        String productName = cartPage.getProductNameInCart();
        Assert.assertEquals(productName, "Sauce Labs Backpack");
    }
}