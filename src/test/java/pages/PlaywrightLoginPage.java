package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class PlaywrightLoginPage {
    private final Page page;
    private final Locator usernameInput;
    private final Locator passwordInput;
    private final Locator loginButton;

    public PlaywrightLoginPage(Page page) {
        this.page = page;
        this.usernameInput = page.locator("#user-name");
        this.passwordInput = page.locator("#password");
        this.loginButton = page.locator("#login-button");
    }

    public void enterUsername(String user) {
        usernameInput.fill(user);
    }

    public void enterPassword(String pass) {
        passwordInput.fill(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
