package com.example.myapplication.data

import androidx.annotation.DrawableRes

sealed class ExampleItem

data class ExampleSquareItem(
    @DrawableRes val icon: Int,
    val name: String,
    val price: String
) : ExampleItem()

data class ExampleRectangleItem(
    @DrawableRes val icon: Int,
    val title: String
) : ExampleItem()

