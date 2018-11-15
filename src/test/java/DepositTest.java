import org.junit.Test;
import ru.raiffeisen.demo.steps.BaseSteps;
import ru.raiffeisen.demo.steps.DepositListSteps;
import ru.raiffeisen.demo.steps.DepositSteps;
import ru.raiffeisen.demo.steps.MainSteps;

import java.util.HashMap;

public class DepositTest extends BaseSteps {

    MainSteps mainSteps = new MainSteps();
    DepositListSteps depositListSteps = new DepositListSteps();
    DepositSteps depositSteps = new DepositSteps();

    @Test
    public void openSavingAccountTest() throws Exception {
        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия", "Иванов");
        testData.put("Имя", "Иван");
        testData.put("Отчество", "Иванович");
        testData.put("Дата рождения", "12121992");
        testData.put("Телефон", "9101234567");
        testData.put("Город", "Москва");
        testData.put("Отделение банка", "732, дополнительный офис «Отделение «Бескудниково»");

        HashMap<String, String> testCheckData = new HashMap<>();
        testCheckData.put("Дата рождения", "12.12.1992");
        testCheckData.put("Телефон", "+7 (910) 123-45-67");

        mainSteps.acceptRegion();
        mainSteps.selectMenuItem("Вклады");
        mainSteps.selectSubMenuItem("Накопительные счета");

        depositListSteps.openDeposit("На каждый день");
        depositSteps.click("Оставить заявку");
        depositSteps.fillField("Фамилия", testData.get("Фамилия"));
        depositSteps.fillField("Имя", testData.get("Имя"));
        depositSteps.fillField("Отчество", testData.get("Отчество"));
        depositSteps.fillField("Дата рождения", testData.get("Дата рождения"));
        depositSteps.fillField("Телефон", testData.get("Телефон"));
        depositSteps.checkField("Дата рождения", testCheckData.get("Дата рождения"));
        depositSteps.checkField("Телефон", testCheckData.get("Телефон"));
        depositSteps.checkFieldIsEnabled("Выслать код");
        depositSteps.selectInput("Город", testData.get("Город"));
        depositSteps.selectInput("Отделение банка", testData.get("Отделение банка"));
        depositSteps.click("Я подтверждаю");
        depositSteps.checkFieldIsPresent("Осталось заполнить Телефон");
    }

}
