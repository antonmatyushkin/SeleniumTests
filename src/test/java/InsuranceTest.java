import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceTest extends BaseTest {

    @Test
    public void testMethod1() {
        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        click(getDriver().findElement(By.xpath("//a[text()='Страхование']")));
        click(getDriver().findElement(By.xpath("//div[text()='В путешествие']//following::a[@class='menu-block__href']")));
        //Для варианта "Вояж Бизнес класс"
        click(getDriver().findElement(By.xpath("//div[@class='b-intro__block-content']//a[text()='Оставить заявку']")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[text()='Форма заявки на страховую программу']")).isDisplayed());
        Assert.assertEquals("Вояж (Комфорт/Бизнес класс/Первый класс)",
                getDriver().findElement(By.xpath("//span[@class='ui-selectmenu-text']")).getText().trim());
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Фамилия']")), "Иванов");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Имя']")), "Иван");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Отчество']")), "Иванович");
        fillField(getDriver().findElement(By.xpath("//div[@class='input-block input-calendar']")), "11111980");
        fillField(getDriver().findElement(By.xpath("//div[@class='input-block']//input[@sys_name='phone']")), "9161609428");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Электронная почта']")), "test@test.ru");
        click(getDriver().findElement(By.xpath("//span[@class='checkbox-block__span']")));
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Проверочный код']")), "12345");
        Assert.assertEquals("button",
                getDriver().findElement(By.xpath("//div[@class='b-block-row']//child::button[contains(text(),' Отправить')]")).getAttribute("class"));
    }
}
