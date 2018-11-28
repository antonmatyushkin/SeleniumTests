package ru.raiffeisen.demo.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.raiffeisen.demo.pages.*;
import ru.raiffeisen.demo.utils.DriverManager;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ScenarioSteps {

    TransferPage transferPage = new TransferPage();
    DepositPage depositPage = new DepositPage();
    DepositListPage depositListPage = new DepositListPage();
    MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage();
    static String currentPageName;

    @When("выбран вклад \"(.*)\"")
    public void openDeposit(String depositName){
        for (WebElement item : depositListPage.depositCollection ){
            if (item.findElement(By.xpath(".//p")).getText().contains(depositName)){
                depositListPage.scrollAndClick(item.findElement(By.xpath(".//*[text()='Открыть счет']")));
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + depositName);
    }


    @When("загружена страница \"(.*)\"")
    public void setCurrentPage(String pageName){
        currentPageName = pageName;
    }

    @When("выбран тип перевода \"(.*)\"")
    public void selectMenuItem(String itemName){
        transferPage.selectMenuItem(transferPage.transferMenu, itemName);
    }


    @When("поле \"(.*)\" заполняется значением \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        page.fillField(name, value);
    }

    @When("проверили, что (.*) страницы \"(.*)\"")
    public void checkPageHeader(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        Assert.assertEquals(value, page.getField(name).getText());
    }


    @When("значение поля \"(.*)\" равно \"(.*)\"")
    public void checkField(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        Assert.assertEquals(value, page.getField(name).getAttribute("value"));
    }

    @When("значение ошибки в поле \"(.*)\" равно \"(.*)\"")
    public void checkErrorField(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        Assert.assertEquals(value, page.getError(name));
    }

    @When("значение не редактируемого поля \"(.*)\" равно \"(.*)\"")
    public void checkStaticTextField(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        Assert.assertEquals(value, page.getField(name).getText());
    }

    @When("поле \"(.*)\" доступно")
    public void checkIsEnabled(String name) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        Assert.assertTrue("Кнопка - "+ name +" не активна", page.getField(name).isEnabled());
    }

    @When("выполнено нажатие на \"(.*)\"")
    public void click(String name) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        page.click(name);
    }

    @When("выпадающий список \"(.*)\" заполняется значением \"(.*)\"")
    public void selectInput(String field, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        WebElement element = page.getField(field);
        page.selectInput(element, value);
    }

    @When("поле \"(.*)\" присутствует")
    public void checkFieldIsPresent(String name)throws Exception{
        try {
            DriverManager.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
            BasePage page = (BasePage) example.newInstance();
            Assert.assertTrue(String.format("Элемент [%s] не видимый", name), page.getField(name).isDisplayed());
        }catch (NoSuchElementException e){
            Assert.fail(String.format("Отсутствует элемент [%s]", name));
        }finally {
            DriverManager.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

    }


    @When("заполняются поля:")
    public void fillFields(DataTable fields) throws Exception {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> {
                    try {
                        fillField(k, v);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }


    @When("поля заполнены значениями:")
    public void checkfillFields(DataTable fields) throws Exception {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> {
                    try {
                        checkField(k, v);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
