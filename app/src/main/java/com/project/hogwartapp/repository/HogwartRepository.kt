package com.project.hogwartapp.repository

import com.project.hogwartapp.data.local.dao.HogwartDao
import com.project.hogwartapp.data.local.entity.CharactersItem
import com.project.hogwartapp.data.remote.ApiService
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class HogwartRepository @Inject constructor(private val apiService: ApiService, private val hogwartDao: HogwartDao) {

    fun getRepoList(): Single<List<CharactersItem>> {
        return apiService.getAllCharacters()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun getCharactersByHouse(house : String) : Single<List<CharactersItem>>{
        return apiService.getCharactersByHouse(house)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}