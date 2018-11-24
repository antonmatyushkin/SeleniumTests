//import org.junit.Test;
////import ru.raiffeisen.demo.steps.InsuranceListSteps_old;
//import ru.raiffeisen.demo.steps.InsuranceSteps_old;
//import ru.raiffeisen.demo.steps.MainSteps;
//
//import java.util.HashMap;
//
//public class InsuranceTest_old extends BaseTest_old {
//
//    MainSteps mainSteps = new MainSteps();
////    InsuranceListSteps_old insuranceListSteps = new InsuranceListSteps_old();
//    InsuranceSteps_old insuranceSteps = new InsuranceSteps_old();
//
//    @Test
//    public void travelInsuranceTest() throws Exception {
//        HashMap<String, String> testData = new HashMap<>();
//        testData.put("Фамилия", "Иванов");
//        testData.put("Имя", "Иван");
//        testData.put("Отчество", "Иванович");
//        testData.put("Дата рождения", "11111980");
//        testData.put("Телефон", "9101234567");
//        testData.put("Электронная почта", "test@test.ru");
//        testData.put("Проверочный код", "15926");
//
//        HashMap<String, String> testCheckData = new HashMap<>();
//        testCheckData.put("Продукт", "Вояж (Комфорт/Бизнес класс/Первый класс)");
//
//        mainSteps.acceptRegion();
//        mainSteps.selectMenuItem("Страхование");
//        mainSteps.selectSubMenuItem("В путешествие");
////        insuranceListSteps.getInsurance("Вояж Бизнес класс");
//        insuranceSteps.click("Оставить заявку");
//        insuranceSteps.checkFieldIsEnabled("Форма заявки на страховую программу");
//        insuranceSteps.checkField("Продукт", testCheckData.get("Продукт"));
//        insuranceSteps.fillField("Фамилия", testData.get("Фамилия"));
//        insuranceSteps.fillField("Имя", testData.get("Имя"));
//        insuranceSteps.fillField("Отчество", testData.get("Отчество"));
//        insuranceSteps.fillField("Дата рождения", testData.get("Дата рождения"));
//        insuranceSteps.fillField("Телефон", testData.get("Телефон"));
//        insuranceSteps.fillField("Электронная почта", testData.get("Электронная почта"));
//        insuranceSteps.fillField("Проверочный код", testData.get("Проверочный код"));
//        insuranceSteps.click("Я подтверждаю");
//        insuranceSteps.checkFieldIsPresent("Отправить");
//    }
//}
