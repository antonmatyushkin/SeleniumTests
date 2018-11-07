import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositeTest extends BaseTest {

    @Test
    public void testDeposite() {
        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        acceptERegion();

    }

    private void acceptERegion() {
        click(getDriver().findElement(By.xpath("//*[text()='Да']")));
    }
}
