package ru.raiffeisen.demo.reporter;

import gherkin.formatter.model.Result;
import io.qameta.allure.Attachment;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.raiffeisen.demo.utils.DriverManager;

public class AllureReporter extends AllureCucumberJvm {

    @Override
    public void result(Result result) {
        if(!result.getStatus().equals("passed") && !result.getStatus().equals("skipped")) {
            takeScreenshot();
        }
        super.result(result);
    }

    @Attachment(type = "image/png", value = "Скриншот в момент ошибки")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
