package com.project.hogwartapp.di.builder

import com.project.hogwartapp.view.HogwartFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {

    @ContributesAndroidInjector
    abstract fun contributeHogwartFragment(): HogwartFragment


//    @ContributesAndroidInjector
//    abstract fun contributeDetailFragment(): DetailFragment

}