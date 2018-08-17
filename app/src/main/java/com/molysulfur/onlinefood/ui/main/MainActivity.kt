package com.molysulfur.onlinefood.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.molysulfur.onlinefood.R
import com.molysulfur.onlinefood.databinding.ActivityMainBinding
import com.molysulfur.onlinefood.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var mMainViewModel : MainViewModel

    lateinit var mViewDataBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    private fun performDataBinding() {
        mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mViewDataBinding.viewModel = mMainViewModel
        mViewDataBinding.executePendingBindings()
    }
}
