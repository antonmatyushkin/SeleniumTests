import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ServiceTest extends BaseTest {


    public void testMethod1() {
        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        click(getDriver().findElement(By.xpath("//a[text()='Сервисы']")));
        click(getDriver().findElement(By.xpath("//div[contains(text(),'Самообслуживание')]//following::div[@class='menu-body']//a[text()='Переводы по карте/телефону']")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[contains(text(),'Перевод с карты на карту / по номеру телефона')]")).isDisplayed());
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Номер карты отправителя']")), "5406571518194617");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Номер карты получателя']")), "5367433138590699");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='ММ']")), "08");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='ГГ']")), "20");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='CVC2']")), "512");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма перевода, \u20BD']")), "5");
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[text()='Минимальная сумма перевода – 10 р.']")).isDisplayed());
    }


    public void testMethod2() {
        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        click(getDriver().findElement(By.xpath("//div[text()='Нет']")));
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[@class='region-list js-region-list']"))));
        click(getDriver().findElement(By.xpath("//div[@class='b-popup__container']//child::a[text()='Владимир']")));
        Assert.assertEquals("Владимир",
                getDriver().findElement(By.xpath("//li[@class='sec-menu__region sec-menu__region__gradient']//a")).getText().trim());
        scrollAndCheck(getDriver().findElement(By.xpath("//div[@class='footer__links col']//ul//li//a[text()='Качество обслуживания']")));
        scrollAndCheck(getDriver().findElement(By.xpath("//div[@class='footer__links col']//ul//li//a[text()='Реквизиты']")));
        scrollAndCheck(getDriver().findElement(By.xpath("//div[@class='footer__links col']//ul//li//a[text()='Карьера в банке']")));
        scrollAndCheck(getDriver().findElement(By.xpath("//div[@class='footer__links col']//ul//li//a[text()='Противодействие коррупции']")));
    }
}
