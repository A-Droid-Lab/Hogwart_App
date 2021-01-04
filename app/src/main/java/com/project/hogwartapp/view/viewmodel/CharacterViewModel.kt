package com.project.hogwartapp.view.viewmodel

import android.util.Log
import com.project.hogwartapp.repository.HogwartRepository
import com.project.hogwartapp.view.base.BaseViewModel
import javax.inject.Inject

class CharacterViewModel @Inject constructor(private val repo : HogwartRepository) : BaseViewModel(){


    fun getAllCharacters(){
        addDisposable(
            repo.getRepoList()
                .subscribe({
                    it.forEach {ch ->
                        Log.d("Network Success:: ", ch.name)
                    }
                },{
                    Log.d("Network Error :: ", it.localizedMessage)
                })
        )
    }

}