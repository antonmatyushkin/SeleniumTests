package ru.raiffeisen.demo.steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import ru.raiffeisen.demo.utils.DriverManager;
import ru.raiffeisen.demo.utils.TestProperties;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {

    private static Properties properties = TestProperties.getInstance().getProperties();

    @Before
    public void startScenario() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(properties.getProperty("app.url"));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
        DriverManager.quitDriver();
    }

}
