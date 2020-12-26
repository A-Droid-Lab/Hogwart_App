package com.project.hogwartapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.project.hogwartapp.data.local.dao.HogwartDao
import com.project.hogwartapp.data.local.entity.CharactersItem
import com.project.hogwartapp.data.local.entity.Wand

@Database(entities = [CharactersItem::class, Wand::class], version = 1, exportSchema = false)
@TypeConverters(*[WandConverter::class])
abstract class HogwartDatabase: RoomDatabase() {
    abstract fun hogwartDao(): HogwartDao
}