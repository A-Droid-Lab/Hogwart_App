package com.project.hogwartapp.data.local.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "wand")
data class Wand(
    @PrimaryKey
    val core: String,
    val length: String,
    val wood: String
) : Parcelable