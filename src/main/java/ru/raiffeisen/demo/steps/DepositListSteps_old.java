package ru.raiffeisen.demo.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.raiffeisen.demo.pages.DepositListPage_old;

public class DepositListSteps_old {

    DepositListPage_old depositListPage = new DepositListPage_old();

    public void openDeposit(String depositName){
        for (WebElement item : depositListPage.depositCollection ){
            if (item.findElement(By.xpath(".//p")).getText().contains(depositName)){
                depositListPage.scrollAndClick(item.findElement(By.xpath(".//*[text()='Открыть счет']")));
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + depositName);
    }
}
