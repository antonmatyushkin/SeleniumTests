//package ru.raiffeisen.demo.steps;
//
//import org.junit.Assert;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import ru.raiffeisen.demo.pages.InsurancePage_old;
//import ru.raiffeisen.demo.utils.DriverManager;
//
//import java.util.concurrent.TimeUnit;
//
//public class InsuranceSteps_old extends BaseSteps {
//
//    InsurancePage_old insurancePage = new InsurancePage_old();
//
//    public void fillField(String name, String value) throws Exception {
//        WebElement element = insurancePage.getField(name);
//        insurancePage.fillField(element, value);
//    }
//
//    public void click(String name) throws Exception {
//        WebElement element = insurancePage.getField(name);
//        insurancePage.click(element);
//    }
//
//    public void checkField(String name, String value) throws Exception {
//        WebElement element = insurancePage.getField(name);
//        Assert.assertEquals(value, element.getAttribute("value"));
//    }
//
//    public void checkFieldIsEnabled(String name) throws Exception {
//        WebElement element = insurancePage.getField(name);
//        Assert.assertTrue(String.format("Поле [%s] не доступно.", name), element.isEnabled());
//    }
//
//    public void selectInput(String field, String value) throws Exception {
//        WebElement element = insurancePage.getField(field);
//        insurancePage.selectInput(element, value);
//    }
//
//    public void checkFieldIsPresent(String name) throws Exception {
//        try {
//            DriverManager.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//            insurancePage.getField(name).isDisplayed();
//        } catch ( NoSuchElementException e) {
//            Assert.fail(String.format("Отсутствует элемент [%s]", name));
//        } finally {
//            DriverManager.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        }
//    }
//}
