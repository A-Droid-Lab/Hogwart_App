package com.project.hogwartapp.di.component

import android.app.Application
import com.project.hogwartapp.HogwartApp
import com.project.hogwartapp.di.builder.ActivityBuilder
import com.project.hogwartapp.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class
    ])
interface AppComponent : AndroidInjector<HogwartApp> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application) : Builder
        fun build() : AppComponent
    }
}