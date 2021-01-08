package com.project.hogwartapp.data.remote

import com.project.hogwartapp.data.MenuItem
import io.reactivex.Single
import retrofit2.http.GET

interface StarbucksApiService {

    @GET("menus")
    fun getAllMenus(): Single<List<MenuItem>>

}