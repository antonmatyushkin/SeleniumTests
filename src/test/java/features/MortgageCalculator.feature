#language: ru
Функционал: Ипотечный калькулятор

  @final
  Сценарий: Ипотека: квартира на вторичном рынке

    * загружена страница "MainPage"
    * подтвержден регион
    * выбран пункт меню "Ипотека"
    * выбрана услуга "Ипотечный калькулятор"
    * загружена страница "MortgageCalculatorPage"
    * проверили, что Заголовок страницы "Ипотечный калькулятор"
    * выпадающий список "Город" заполняется значением "Москва"
    * выполнено нажатие на "Знаю свою ипотечную программу"
    * выпадающий список "Вид ипотечной программы" заполняется значением "Квартира на вторичном рынке"
    * выпадающий список "Я являюсь" заполняется значением "Новый клиент"
    * выпадающий список "Уровень доходов подтверждаю" заполняется значением "Справка по форме Банка"
    * поле "В банке возьму" заполняется значением "3000000"
    * поле "Первоначальный взнос" заполняется значением "3500000"
    * поле "Срок кредита" заполняется значением "10"
    * выполнено нажатие на "Рассчитать"
    * проверяю, что поле "Ежемесячный платеж" содержит текст "40 656.67 руб."
    * проверяю, что поле "Общая сумма выплат" содержит текст "4 836 819.11 руб."
    * проверяю, что поле "Cумма выплат по процентам" содержит текст "1 836 819.11 руб."
    * проверяю, что поле "Процентная ставка" содержит текст "10.49 %"