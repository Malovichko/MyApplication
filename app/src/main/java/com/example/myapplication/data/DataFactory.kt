package com.example.myapplication.data

import com.example.myapplication.R

class DataFactory {
    companion object {
        fun getStaffList(): ArrayList<ExampleItem> =
            arrayListOf(
                ExampleSquareItem(R.drawable.ic_bill, "Квитанции", "- 40 080,55 ₽"),
                ExampleSquareItem(R.drawable.ic_counter, "Счетчики", "Подайте показания"),
                ExampleSquareItem(R.drawable.ic_installment, "Рассрочка", "Сл. платеж 25.02.2018"),
                ExampleSquareItem(R.drawable.ic_insurance, "Страхование ", "Полис до 12.01.2019"),
                ExampleSquareItem(R.drawable.ic_tv, "Интернет и ТВ", "Баланс 350 ₽"),
                ExampleSquareItem(R.drawable.ic_homephone, "Домофон", "Подключен"),
                ExampleRectangleItem(R.drawable.ic_guard, "Охрана"),
                ExampleRectangleItem(R.drawable.ic_uk_contacts, "Контакты УК и служб"),
                ExampleRectangleItem(R.drawable.ic_request, "Мои заявки"),
                ExampleRectangleItem(R.drawable.ic_about, "Памятка жителя А101")
            )
    }
}