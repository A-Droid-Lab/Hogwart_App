package com.project.hogwartapp.data.local.entity

import com.project.hogwartapp.data.remote.dto.Wand

class Characters : ArrayList<CharactersItem>()

data class CharactersItem(
    val actor: String,
    val alive: Boolean,
    val ancestry: String,
    val dateOfBirth: String,
    val eyeColour: String,
    val gender: String,
    val hairColour: String,
    val hogwartsStaff: Boolean,
    val hogwartsStudent: Boolean,
    val house: String,
    val image: String,
    val name: String,
    val patronus: String,
    val species: String,
    val wand: Wand,
    val yearOfBirth: Int
)

