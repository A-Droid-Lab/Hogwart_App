package com.project.hogwartapp.repository

import com.project.hogwartapp.data.MenuItem
import com.project.hogwartapp.data.local.dao.HogwartDao
import com.project.hogwartapp.data.local.entity.CharactersItem
import com.project.hogwartapp.data.remote.ApiService
import com.project.hogwartapp.data.remote.StarbucksApiService
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class StarbucksRepository @Inject constructor(private val apiService: StarbucksApiService) {

    fun getAllMenus(): Single<List<MenuItem>> {
        return apiService.getAllMenus()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }


}