package com.example.questionnineactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemsData(
    var text_one : String,
    var text_two : String
) : Parcelable