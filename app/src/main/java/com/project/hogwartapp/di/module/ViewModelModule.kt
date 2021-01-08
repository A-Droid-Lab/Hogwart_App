package com.project.hogwartapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.hogwartapp.di.ViewModelKey
import com.project.hogwartapp.view.viewmodel.CharacterViewModel
import com.project.hogwartapp.view.viewmodel.StarbucksViewModel
import com.project.hogwartapp.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindsViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CharacterViewModel::class)
    abstract fun bindsCharacterViewModel(characterViewModel: CharacterViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(StarbucksViewModel::class)
    abstract fun bindsStarbucksViewModel(starbucksViewModel: StarbucksViewModel): ViewModel

}