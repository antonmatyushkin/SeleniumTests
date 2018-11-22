package ru.raiffeisen.demo.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import ru.raiffeisen.demo.pages.InsuranceListPage_old;
//
//public class InsuranceListSteps_old {
//
//    InsuranceListPage_old insuranceListPage = new InsuranceListPage_old();
//
//    public void getInsurance(String insuranceName){
//        for (WebElement item : insuranceListPage.insuranceCollection ){
//            if (item.findElement(By.xpath("//h1")).getText().contains(insuranceName)){
//                insuranceListPage.scrollAndClick(item.findElement(By.xpath(".//*[text()='Оставить заявку']")));
//                return;
//            }
//        }
//        Assert.fail("Не найден элмент коллеции - " + insuranceName);
//    }
//}
