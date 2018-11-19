package ru.raiffeisen.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.demo.annotation.FieldName;
import ru.raiffeisen.demo.utils.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class InsurancePage_old extends BasePage {

    @FindBy(xpath = "//a[text()='Оставить заявку'][@class='button']/ancestor::div[@class='b-intro__block-buttons']")
    @FieldName(name = "Оставить заявку")
    public WebElement requestBtn;

    @FindBy(xpath = "//h1[text()='Форма заявки на страховую программу']")
    @FieldName(name = "Форма заявки на страховую программу")
    public WebElement insuranseProgramApplication;

    @FindBy(xpath = "//span[@class='ui-selectmenu-text']")
    @FieldName(name = "Продукт")
    public WebElement product;

    @FindBy(xpath = "//input[@placeholder='Фамилия']")
    @FieldName(name = "Фамилия")
    public WebElement surname;

    @FindBy(xpath = "//input[@placeholder='Имя']")
    @FieldName(name = "Имя")
    public WebElement name;

    @FindBy(xpath = "//input[@placeholder='Отчество']")
    @FieldName(name = "Отчество")
    public WebElement middleName;

    @FindBy(xpath = "//input[@placeholder='Дата рождения']")
    @FieldName(name = "Дата рождения")
    public WebElement birthDate;

    @FindBy(xpath = "//div[@class='input-block']//input[@sys_name='phone']")
    @FieldName(name = "Телефон")
    public WebElement phone;

    @FindBy(xpath = "//input[@placeholder='Электронная почта']")
    @FieldName(name = "Электронная почта")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Проверочный код']")
    @FieldName(name = "Проверочный код")
    public WebElement verificationCode;

    @FindBy(xpath = "//span[@class='checkbox-block__span']")
    @FieldName(name = "Я подтверждаю")
    public WebElement acceptCheckBox;

    @FindBy(xpath = "//div[@class='b-block-row']//child::button[contains(text(),' Отправить')]")
    @FieldName(name = "Отправить")
    public WebElement buttonSend;


    public WebElement getField(String name) throws Exception {
        Class depositePageClass = Class.forName("ru.raiffeisen.demo.pages.InsurancePage_old");
        List<Field> fields = Arrays.asList(depositePageClass.getFields());

        for (Field field : fields) {
            if (field.getAnnotation(FieldName.class).name().equals(name)) {
                return DriverManager.getDriver().findElement(By.xpath(field.getAnnotation(FindBy.class).xpath()));
            }
        }
        Assert.fail("Не объявлен элемент с именем \"" + name + "\".");
        return null;
    }
}
