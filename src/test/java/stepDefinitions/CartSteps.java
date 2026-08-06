package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InventoryPage;
import pages.CartPage;

public class CartSteps {

    InventoryPage inventoryPage = new InventoryPage(Hooks.getDriver());
    CartPage cartPage = new CartPage(Hooks.getDriver());

    @When("the user clicks the {string} button for the Sauce Labs Backpack")
    public void the_user_clicks_the_button_for_the_sauce_labs_backpack(String buttonText) {
        inventoryPage.clickAddBackpackToCart();
    }

    @Then("the button text for the item should change to {string}")
    public void the_button_text_for_the_item_should_change_to(String expectedText) {
        String actualText = inventoryPage.getRemoveButtonText();
        Assert.assertEquals(actualText, expectedText, "El texto del botón no cambió a Remove");
    }

    @Then("the shopping cart badge should display {string}")
    public void the_shopping_cart_badge_should_display(String expectedCount) {
        String actualCount = inventoryPage.getCartBadgeCount();
        Assert.assertEquals(actualCount, expectedCount, "El número en el carrito es incorrecto");
    }

    @When("the user clicks on the shopping cart icon")
    public void the_user_clicks_on_the_shopping_cart_icon() {
        inventoryPage.clickCartIcon();
    }

    @Then("the user should see the Sauce Labs Backpack on the Cart page")
    public void the_user_should_see_the_sauce_labs_backpack_on_the_cart_page() {
        Assert.assertTrue(cartPage.isBackpackInCart(), "The Sauce Labs Backpack is not found on the Cart Page");
    }
}
