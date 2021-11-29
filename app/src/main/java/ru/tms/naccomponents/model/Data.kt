package ru.tms.naccomponents.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data(
    val string: String
) : Parcelable
