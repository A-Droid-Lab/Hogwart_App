package com.project.hogwartapp.data.local.entity

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "characters")
data class CharactersItem(
    val actor: String?,
    val alive: Boolean?,
    val ancestry: String?,
    val dateOfBirth: String?,
    val eyeColour: String?,
    val gender: String?,
    val hairColour: String?,
    val hogwartsStaff: Boolean?,
    val hogwartsStudent: Boolean?,
    val house: String?,
    val image: String?,
    @PrimaryKey
    val name: String,
    val patronus: String?,
    val species: String?,
    val yearOfBirth: String?
) : Parcelable