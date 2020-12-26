package com.project.hogwartapp.di.builder

import com.project.hogwartapp.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [FragmentBuilder::class])
    abstract fun contributeMainActivity(): MainActivity

}