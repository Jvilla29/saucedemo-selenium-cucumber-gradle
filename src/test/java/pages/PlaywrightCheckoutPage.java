package pages;

import com.microsoft.playwright.Page;

public class PlaywrightCheckoutPage {
    private final Page page;

    private final String checkoutButton = "#checkout";
    private final String firstNameInput = "#first-name";
    private final String lastNameInput = "#last-name";
    private final String postalCodeInput = "#postal-code";
    private final String continueButton = "#continue";
    private final String finishButton = "#finish";
    private final String completeHeader = ".complete-header";

    public PlaywrightCheckoutPage(Page page) {
        this.page = page;
    }

    public void clickCheckoutButton() {
        page.click(checkoutButton);
    }

    public void fillFirstName(String firstName) {
        page.fill(firstNameInput, firstName);
    }

    public void fillLastName(String lastName) {
        page.fill(lastNameInput, lastName);
    }

    public void fillPostalCode(String postalCode) {
        page.fill(postalCodeInput, postalCode);
    }

    public void clickContinueButton() {
        page.click(continueButton);
    }

    public void clickFinishButton() {
        page.click(finishButton);
    }

    public String getCompleteHeaderText() {
        return page.textContent(completeHeader);
    }
}
