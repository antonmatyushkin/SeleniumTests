package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InsuranceListPage_old extends BasePage {

    @FindBy(xpath = "//div[@class='b-intro__block-content']")
    public List<WebElement> insuranceCollection;
}
