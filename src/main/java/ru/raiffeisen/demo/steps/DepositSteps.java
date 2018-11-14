package ru.raiffeisen.demo.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ru.raiffeisen.demo.pages.DepositPage;

public class DepositSteps {

    DepositPage depositPage = new DepositPage();

    public void fillField(String name, String value) throws Exception {
        WebElement element = depositPage.getField(name);
        depositPage.fillField(element, value);
    }

    public void click(String name) throws Exception {
        WebElement element = depositPage.getField(name);
        depositPage.click(element);
    }

    public void checkField(String name, String value) throws Exception {
        WebElement element = depositPage.getField(name);
        Assert.assertEquals(value, element.getAttribute("value"));
    }

    public void checkFieldIsEnabled(String name) throws Exception {
        WebElement element = depositPage.getField(name);
        Assert.assertTrue(String.format("Поле [%s] не доступно.", name), element.isEnabled());
    }
}
