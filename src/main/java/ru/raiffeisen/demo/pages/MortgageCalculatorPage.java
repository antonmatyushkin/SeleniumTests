package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.demo.annotation.FieldName;

public class MortgageCalculatorPage {

    @FindBy(xpath = "//h1")
    @FieldName(name = "Заголовок")
    public WebElement header;

    @FindBy(xpath = "//div[contains(text(),'Город')]/preceding-sibling::span")
    @FieldName(name = "Список город")
    public WebElement cityList;

    @FindBy(xpath = "//li/div[contains(text(),'Москва')]")
    @FieldName(name = "Москва")
    public WebElement moscow;

    @FindBy(xpath = "//*[@id='form_is_program']/following-sibling::span")
    @FieldName(name = "Знаю свою ипотечную программу")
    public WebElement iKnow;

    @FindBy(xpath = "//div[contains(text(),'Вид ипотечной программы')]/preceding-sibling::span")
    @FieldName(name = "Вид ипотечной программы")
    public WebElement mortgageProgrammType;

    @FindBy(xpath = "//li/div[contains(text(),'Квартира на вторичном рынке')]")
    @FieldName(name = "Квартира на вторичном рынке")
    public WebElement secondaryMarket;

    @FindBy(xpath = "//div[contains(text(),'Я являюсь')]/preceding-sibling::span")
    @FieldName(name = "Я являюсь")
    public WebElement clientTypeList;

    @FindBy(xpath = "//li/div[contains(text(),'Новый клиент')]")
    @FieldName(name = "Новый клиент")
    public WebElement newClient;

    @FindBy(xpath = "//div[contains(text(),'Уровень доходов подтверждаю')]/preceding-sibling::span")
    @FieldName(name = "Уровень доходов подтверждаю")
    public WebElement salaryConfirm;

    @FindBy(xpath = "//li/div[contains(text(),'Справка по форме Банка')]")
    @FieldName(name = "Справка по форме Банка")
    public WebElement bankForm;

    @FindBy(xpath = "//div[contains(text(),'В банке возьму')]/preceding-sibling::input")
    @FieldName(name = "В банке возьму")
    public WebElement blackMoney;

    @FindBy(xpath = "//div[contains(text(),'Первоначальный взнос')]/preceding-sibling::input")
    @FieldName(name = "Первоначальный взнос")
    public WebElement firstRepay;

    @FindBy(xpath = "//div[contains(text(),'Срок кредита')]/preceding-sibling::input")
    @FieldName(name = "Срок кредита")
    public WebElement loanTime;

    @FindBy(xpath = "//input[@value='Рассчитать']")
    @FieldName(name = "Рассчитать")
    public WebElement calculateBtn;

    @FindBy(xpath = "//span[contains(text(),'Ежемесячный платеж')]/following::span[@class='monthly-payment']")
    @FieldName(name = "Ежемесячный платеж")
    public WebElement monthlyPay;

    @FindBy(xpath = "//div[contains(text(),'Общая сумма выплат')]/following::div[@class='b-calc-result__text--right total-payment']")
    @FieldName(name = "Общая сумма выплат")
    public WebElement fullPay;

    @FindBy(xpath = "//div[contains(text(),'Cумма выплат по процентам')]/following::div[@class='b-calc-result__text--right percent-sum']")
    @FieldName(name = "Cумма выплат по процентам")
    public WebElement interestPay;

    @FindBy(xpath = "//div[contains(text(),'Процентная ставка')]/following::div[@class='b-calc-result__text--right interest-rate']")
    @FieldName(name = "Процентная ставка")
    public WebElement interestRate;


}
