package com.molysulfur.onlinefood.di.component

import android.app.Application
import com.molysulfur.onlinefood.MainApplication
import com.molysulfur.onlinefood.di.builder.ActivityBuilder
import com.molysulfur.onlinefood.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent {

    fun inject(mainApplication : MainApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application) : Builder

        fun build() : AppComponent
    }
}