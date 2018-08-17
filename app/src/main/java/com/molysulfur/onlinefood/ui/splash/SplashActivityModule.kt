package com.molysulfur.onlinefood.ui.splash

import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule{
    @Provides
    fun provideSplashViewModel() = SplashViewModel()
}