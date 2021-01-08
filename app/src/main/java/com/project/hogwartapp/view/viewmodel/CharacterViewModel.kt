package com.project.hogwartapp.view.viewmodel

import android.util.Log
import com.project.hogwartapp.data.local.entity.CharactersItem
import com.project.hogwartapp.repository.HogwartRepository
import com.project.hogwartapp.view.base.BaseViewModel
import io.reactivex.functions.Predicate
import java.util.*
import javax.inject.Inject

class CharacterViewModel @Inject constructor(private val repo : HogwartRepository) : BaseViewModel(){


    fun getAllCharacters(){
        addDisposable(
                repo.getRepoList()
                        .toObservable()
                        .flatMapIterable { it }
                        .filter { t -> t.house?.contains("Slytherin")!! }
                        .toList()
                        .subscribe({
                            it.forEach { ch ->
                                Log.d("Network Success:: ", ch.name +" house : "+ch.house)
                            }
                        }, {
                            Log.d("Network Error :: ", it.localizedMessage)
                        })
        )
    }

    fun getCharactersByHouse(house : String){
        addDisposable(
                repo.getCharactersByHouse(house)
                        .subscribe({
                            it.forEach {
                                Log.d("$house : ", it.name)
                            }
                        },{
                            Log.d("Network Error :: ", it.localizedMessage)
                        })
        )

    }

    fun getAllHogwarts(){
        addDisposable(
            repo.getRepoList()
                .subscribe({
                    it.forEach { ch ->
                        Log.d("Network Success:: ", ch.name +" house : "+ch.house)
                    }
                }, {
                    Log.d("Network Error :: ", it.localizedMessage)
                })
        )
    }

}