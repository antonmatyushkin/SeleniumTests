package ru.raiffeisen.demo.steps;

import cucumber.api.java.en.When;
import ru.raiffeisen.demo.pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @When("Выбран пункт меню \"(.*)\"")
    public void selectMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.mainMenu, itemName);
    }

    @When("Выбран подпункт меню \"(.*)\"")
    public void selectSubMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.subMenu, itemName);
    }

    @When("Подтвержден регион")
    public void acceptRegion() {
        mainPage.click(mainPage.acceptRegion);
    }

    @When("Закрыто всплывающее окно")
    public void closeBunner() {
        mainPage.click(mainPage.closeBtn);
    }
}
