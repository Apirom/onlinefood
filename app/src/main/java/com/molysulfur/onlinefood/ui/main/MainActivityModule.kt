package com.molysulfur.onlinefood.ui.main

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule{
    @Provides
    fun provideMainViewModel() = MainViewModel()
}