package pages;

import com.microsoft.playwright.Page;

public class PlaywrightLogoutPage {
    private Page page;
    private String hamburgerMenuButton = "#react-burger-menu-btn";
    private String logoutLink = "#logout_sidebar_link";
    
    public PlaywrightLogoutPage(Page page) {
        this.page = page;
    }
    
    public void clickHamburgerMenu() {
        page.click(hamburgerMenuButton);
    }
    
    public void clickLogout() {
        page.click(logoutLink);
    }
}
