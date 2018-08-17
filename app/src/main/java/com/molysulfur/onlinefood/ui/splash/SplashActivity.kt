package com.molysulfur.onlinefood.ui.splash

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.molysulfur.onlinefood.R
import com.molysulfur.onlinefood.databinding.ActivitySplashBinding
import com.molysulfur.onlinefood.ui.base.BaseActivity
import javax.inject.Inject

class SplashActivity : BaseActivity(){

    @Inject
    lateinit var mSplashViewModel : SplashViewModel

    lateinit var mViewDataBinding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        mViewDataBinding.viewModel = mSplashViewModel
        mViewDataBinding.executePendingBindings()
    }
}