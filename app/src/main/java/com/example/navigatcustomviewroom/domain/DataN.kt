package com.example.navigatcustomviewroom.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataN (
    val data: List<News>
) : Parcelable