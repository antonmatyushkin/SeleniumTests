package ru.raiffeisen.demo.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.raiffeisen.demo.pages.InsuranceListPage;

public class InsuranceListSteps {

    InsuranceListPage insuranceListPage = new InsuranceListPage();

    public void getInsurance(String insuranceName){
        for (WebElement item : insuranceListPage.insuranceCollection ){
            if (item.findElement(By.xpath("//h1")).getText().contains(insuranceName)){
                insuranceListPage.scrollAndClick(item.findElement(By.xpath(".//*[text()='Оставить заявку']")));
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + insuranceName);
    }
}
