package ru.raiffeisen.demo.pages;
;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@class='main-menu']//li")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "//a[contains(@class,'menu-section-link')][@href]")
    public List<WebElement> sectionMenu;

    @FindBy(xpath = "//a[contains(@class,'menu-link main-menu__link')][@href]")
    public List<WebElement> subMenu;

    @FindBy(xpath = "//*[text()='Да']")
    public WebElement acceptRegion;

    @FindBy(xpath = "//icon-close")
    public WebElement closeBtn;

    @Override
    public WebElement getField(String className) throws Exception {
        return getField(className, "ru.raiffeisen.demo.pages.MainPage");
    }

}
