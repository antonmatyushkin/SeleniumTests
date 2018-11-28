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
    * значение поля "Ежемесячный платеж" равно "40 656.67 руб."
    * значение поля "Общая сумма выплат" равно "4 836 820.89 руб."
    * значение поля "Cумма выплат по процентам" равно "1 836 820.89 руб."
    * значение поля "Процентная ставка" равно "10.49 %"