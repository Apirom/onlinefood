package com.molysulfur.onlinefood.ui.main

import android.databinding.ObservableField
import com.molysulfur.onlinefood.ui.base.BaseViewModel

class MainViewModel : BaseViewModel() {
    var helloWorld : ObservableField<String> = ObservableField("Hello World")
}