package com.feeltheboard.hobbyhub.model

import androidx.annotation.DrawableRes

data class Course(
    @DrawableRes val image: Int,
    val title: String,
    val quantity: Int
)