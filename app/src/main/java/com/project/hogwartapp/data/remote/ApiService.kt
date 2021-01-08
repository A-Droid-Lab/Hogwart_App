package com.project.hogwartapp.data.remote

import com.project.hogwartapp.data.local.entity.Characters
import com.project.hogwartapp.data.local.entity.CharactersItem
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("characters")
    fun getAllCharacters(): Single<List<CharactersItem>>

    @GET("characters/students")
    fun getAllStudents(): Single<Characters>

    @GET("characters/staff")
    fun getAllStaff(): Single<Characters>

    @GET("characters/house/{house}")
    fun getCharactersByHouse(@Path("house") house: String): Single<List<CharactersItem>>
}


//http://hp-api.herokuapp.com/api/characters - view all characters
//http://hp-api.herokuapp.com/api/characters/students - view all characters who are Hogwarts students during the book series
//http://hp-api.herokuapp.com/api/characters/staff - view all characters who are Hogwarts staff during the book series
//http://hp-api.herokuapp.com/api/characters/house/:house - view all characters in a certain house, e.g. /slytherin