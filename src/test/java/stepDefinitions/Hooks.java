package stepDefinitions;

// --- Cucumber Imports ---
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

// --- Selenium Imports ---
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration;

// --- Playwright Imports ---
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Hooks {

    // --- Switch to control which framework runs ---
    // Change to "selenium" to run your original code
    public static String activeFramework = "playwright";

    // --- Selenium Variables ---
    private static WebDriver driver;

    // --- Playwright Variables ---
    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setUp() {
        if (activeFramework.equalsIgnoreCase("playwright")) {
            // Playwright setup
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            page = browser.newPage();

        } else if (activeFramework.equalsIgnoreCase("selenium")) {
            // Original Selenium setup
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");

            java.util.Map<String, Object> prefs = new java.util.HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", prefs);

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    @After
    public void tearDown() {
        if (activeFramework.equalsIgnoreCase("playwright")) {
            // Playwright teardown
            if (browser != null)
                browser.close();
            if (playwright != null)
                playwright.close();

        } else if (activeFramework.equalsIgnoreCase("selenium")) {
            // Original Selenium teardown
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (activeFramework.equalsIgnoreCase("playwright")) {
            // Take screenshot using Playwright
            if (page != null) {
                final byte[] screenshot = page.screenshot();
                scenario.attach(screenshot, "image/png", "Step Screenshot");
            }
        } else if (activeFramework.equalsIgnoreCase("selenium")) {
            // Take screenshot using Selenium
            if (driver != null) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Step Screenshot");
            }
        }
    }

    // Keep your existing getter for Selenium
    public static WebDriver getDriver() {
        return driver;
    }

    // Add a new getter for Playwright just in case
    public static Page getPage() {
        return page;
    }
}