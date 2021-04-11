package com.example.myapplication.data

import androidx.annotation.DrawableRes

data class StaffModel (
    @DrawableRes val icon: Int,
    val name: String,
    val price: String
)

