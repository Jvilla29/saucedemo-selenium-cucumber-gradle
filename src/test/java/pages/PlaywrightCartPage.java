package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PlaywrightCartPage {
    private final Page page;

    private final Locator addToCartBackpackButton;
    private final Locator removeBackpackButton;
    private final Locator cartBadge;
    private final Locator cartIcon;
    private final Locator productNameInCart;

    public PlaywrightCartPage(Page page) {
        this.page = page;
        this.addToCartBackpackButton = page.locator("#add-to-cart-sauce-labs-backpack");
        this.removeBackpackButton = page.locator("#remove-sauce-labs-backpack");
        this.cartBadge = page.locator(".shopping_cart_badge");
        this.cartIcon = page.locator(".shopping_cart_link");
        this.productNameInCart = page.locator(".inventory_item_name");
    }

    public void addBackpackToCart() {
        addToCartBackpackButton.click();
    }

    public String getRemoveButtonText() {
        return removeBackpackButton.textContent();
    }

    public boolean isCartBadgeVisible() {
        return cartBadge.isVisible();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public String getProductNameInCart() {
        return productNameInCart.textContent();
    }
}
