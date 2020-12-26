package com.project.hogwartapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.project.hogwartapp.data.local.entity.CharactersItem
import io.reactivex.Single

@Dao
abstract class HogwartDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertCharacters(characterList: List<CharactersItem>)

    @Query("SELECT * FROM characters WHERE name = :name")
    abstract fun getCharactersFromDb(name: String): Single<List<CharactersItem>>
}