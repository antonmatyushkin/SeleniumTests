import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriverWait wait;
    private static WebDriver driver;

    public static WebDriver getDriver() { return driver; }

    @Before
    public void startScenario() {
//        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void afterMethod() {
        if (getDriver() != null) {
            driver.quit();
        }
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void scrollAndClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("return arguments[0].scrollIntoView(false);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void scrollAndCheck(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("return arguments[0].scrollIntoView(false);", element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.TAB);
    }
}