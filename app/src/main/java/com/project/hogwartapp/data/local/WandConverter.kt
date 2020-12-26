package com.project.hogwartapp.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.hogwartapp.data.local.entity.Wand
import java.lang.reflect.Type

class WandConverter {

    private val gson = Gson()
    private val type: Type = object : TypeToken<Wand>() {}.type

    @TypeConverter
    fun stringToWand(json : String) : Wand {
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun wandToString(wand: Wand) : String{
        return gson.toJson(wand, type)
    }
}