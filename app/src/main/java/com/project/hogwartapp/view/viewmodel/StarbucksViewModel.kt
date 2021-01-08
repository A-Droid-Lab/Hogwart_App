package com.project.hogwartapp.view.viewmodel

import android.util.Log
import com.project.hogwartapp.repository.StarbucksRepository
import com.project.hogwartapp.view.base.BaseViewModel
import javax.inject.Inject

class StarbucksViewModel @Inject constructor(private val repo : StarbucksRepository): BaseViewModel(){

    fun getAllMenus(){
        addDisposable(
                repo.getAllMenus()
                        .toObservable()
                        .flatMapIterable { it }
                        .filter { t -> t.id in 387..478 }
                        .toList()
                        .subscribe({
                            it.forEach {
                                Log.d("샌드위티 & 케이크 ", it.name)
                            }


                        },{
                            Log.d("Error Response ", it.localizedMessage)
                        })         
        )
    }

}