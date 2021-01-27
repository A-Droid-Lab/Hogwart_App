package com.project.hogwartapp.di.builder

import com.project.hogwartapp.view.fragment.HogwartFragment
import com.project.hogwartapp.view.fragment.HouseDetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {

    @ContributesAndroidInjector
    abstract fun contributeHogwartFragment(): HogwartFragment

    @ContributesAndroidInjector
    abstract fun contributeHouseDetailFragment(): HouseDetailFragment


}