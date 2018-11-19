import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoTest_old extends BaseTest_old {


    public void testMethod() {
        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/");
        click(getDriver().findElement(By.xpath("//icon-close")));
        click(getDriver().findElement(By.xpath("//span[text()='Перевести']")));
        click(getDriver().findElement(By.xpath("//div[text()='Клиенту банка']")));
        selectInput(getDriver().findElement(By.xpath("//span[text()='Выберите…']")), "Мой счет в рублях");
        click(getDriver().findElement(By.xpath("//*[text()='По номеру телефона']")));
        fillField(getDriver().findElement(By.xpath("//input[contains(@class,'phone__input')]")), "79161609428");


        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма']")), "0");
        Assert.assertEquals("Сумма перевода должна быть больше 0",
                getDriver().findElement(By.xpath("//span[@class='simple-error']")).getText().trim());

        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма']")), "100000000");
        Assert.assertEquals("Введенная сумма превышает максимально допустимую (1 000 000,00 \u20BD)",
                getDriver().findElement(By.xpath("//control-errors[@class='control-errors control-errors_show']/child::control-error/child::validation-error/child::simple-error")).getText().trim());

        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма']")), "100");

        fillField(getDriver().findElement(By.xpath("//ruble-transfer-form-message//textarea")), "test");

        click(getDriver().findElement(By.xpath("//button//*[text()='Перевести']")));
    }


    public void testMethod2() {
        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/");
        click(getDriver().findElement(By.xpath("//icon-close")));
        click(getDriver().findElement(By.xpath("//span[text()='Шаблоны и автоплатежи']")));
        selectInput(getDriver().findElement(By.xpath("//span[text()='Выберите операцию']")), "Мобильная связь");
        click(getDriver().findElement(By.xpath("//button[text()='Создать']")));
        fillField(getDriver().findElement(By.xpath("//input[contains(@class,'phone__input')]")), "79161609428");
        selectInput(getDriver().findElement(By.xpath("//span[text()='Выберите…']")), "Кредитка Visa");
        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма']")), "29.99");
        Assert.assertEquals("Введенная сумма меньше минимальной разрешенной (30,00 \u20BD)",
                getDriver().findElement(By.xpath("//control-errors[@class='control-errors control-errors_show']/child::control-error/child::validation-error/child::simple-error")).getText().trim());

        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма']")), "15000");
        Assert.assertEquals("Введенная сумма превышает максимально допустимую (14 999,99 \u20BD)",
                getDriver().findElement(By.xpath("//control-errors[@class='control-errors control-errors_show']/child::control-error/child::validation-error/child::simple-error")).getText().trim());

        fillField(getDriver().findElement(By.xpath("//input[@placeholder='Сумма']")), "100");
    }

    public void selectInput(WebElement select, String value) {
        select.click();
        click(select.findElement(By.xpath("//*[text()='" + value + "']")));
    }
}
