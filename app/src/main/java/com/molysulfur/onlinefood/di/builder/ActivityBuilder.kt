package com.molysulfur.onlinefood.di.builder

import com.molysulfur.onlinefood.ui.main.MainActivity
import com.molysulfur.onlinefood.ui.main.MainActivityModule
import com.molysulfur.onlinefood.ui.splash.SplashActivity
import com.molysulfur.onlinefood.ui.splash.SplashActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity() : MainActivity

    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    abstract fun bindSplashActivity() : SplashActivity
}