package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.demo.annotation.FieldName;

import java.util.List;

public class TransferPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'extension-menu__name')]")
    @FieldName(name = "Виды переводов")
    public List<WebElement> transferMenu;

    @FindBy(xpath = "//*[text()='Счет списания']/ancestor::ruble-transfer-form-account//div[@class='rc-row__value']")
    @FieldName(name = "Счет списания")
    public WebElement fromAccount;


    @FindBy(xpath = "//*[text()='По номеру телефона']")
    @FieldName(name = "По номеру телефона")
    public WebElement byPhoneNumber;

    @FindBy(xpath = "//*[text()='Номер телефона получателя']/ancestor::div[@class='rc-row ng-star-inserted']//input[contains(@class,'input ')]")
    @FieldName(name = "Номер телефона получателя")
    public WebElement phone;

    @FindBy(xpath = "//div[@class='rc-row__value']//input[@placeholder='Сумма']")
    @FieldName(name = "Сумма")
    public WebElement amount;

    @FindBy(xpath = "//*[text()='ФИО получателя']/ancestor::div[@class='rc-row ng-star-inserted']//div[contains(@class,'static-value')]")
    @FieldName(name = "ФИО получателя")
    public WebElement fio;

    @FindBy(xpath = "//*[text()='Перевести']/parent::button")
    @FieldName(name = "Перевести")
    public WebElement transferBtn;


    @FindBy(xpath = "//c-commission-ruble-transfer")
    @FieldName(name = "Коммиссия")
    public WebElement commission;


    @FindBy(xpath = "//textarea")
    @FieldName(name = "Сообщение")
    public WebElement msgArea;




    @Override
    public WebElement getField(String className) throws Exception {
        return getField(className, "ru.raiffeisen.demo.pages.TransferPage");
    }
}
