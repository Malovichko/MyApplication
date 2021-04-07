package data

import com.example.myapplication.R

class DataFactory {
    companion object {
        fun getStaffList(): ArrayList<StaffModel> =
            arrayListOf(
                StaffModel(R.drawable.ic_bill, "Квитанции", "- 40 080,55 ₽"),
                StaffModel(R.drawable.ic_counter, "Счетчики", "Подайте показания"),
                StaffModel(R.drawable.ic_installment, "Рассрочка", "Сл. платеж 25.02.2018"),
                StaffModel(R.drawable.ic_insurance, "Страхование ", "Полис до 12.01.2019"),
                StaffModel(R.drawable.ic_tv, "Интернет и ТВ", "Баланс 350 ₽"),
                StaffModel(R.drawable.ic_homephone, "Домофон", "Подключен"),
                StaffModel(R.drawable.ic_guard, "Охрана", "Нет")
            )
    }
}