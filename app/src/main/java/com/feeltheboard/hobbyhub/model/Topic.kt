package com.feeltheboard.hobbyhub.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    val quantity: Int,
    @DrawableRes val image: Int
)