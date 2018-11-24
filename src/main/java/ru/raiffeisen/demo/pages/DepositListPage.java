package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositListPage extends BasePage {

    @FindBy(xpath = "//div[@class='b-card__content']")
    public List<WebElement> depositCollection;

    @Override
    public WebElement getField(String name) throws Exception {
        return null;
    }
}
