package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.demo.annotation.FieldName;

public class TransferResultPage extends BasePage {

    @FindBy(xpath = "//*[text()='ФИО получателя:']/following-sibling::div")
    @FieldName(name = "ФИО получателя")
    public WebElement fio;


    @FindBy(xpath = "//*[text()='Сумма перевода:']/following-sibling::div")
    @FieldName(name = "Сумма перевода")
    public WebElement amount;

    @FindBy(xpath = "//*[text()='Комиссия']/following-sibling::div")
    @FieldName(name = "Комиссия")
    public WebElement commission;



    @Override
    public WebElement getField(String className) throws Exception {
        return getField(className, "ru.raiffeisen.demo.pages.TransferResultPage");
    }
}
