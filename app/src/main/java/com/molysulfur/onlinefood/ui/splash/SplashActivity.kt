package com.molysulfur.onlinefood.ui.splash

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.CountDownTimer
import com.molysulfur.onlinefood.R
import com.molysulfur.onlinefood.databinding.ActivitySplashBinding
import com.molysulfur.onlinefood.ui.base.BaseActivity
import com.molysulfur.onlinefood.ui.main.MainActivity
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
        initInstaces()
    }

    private fun initInstaces() {
        object : CountDownTimer(3000,1000){
            override fun onFinish() {
                val intent = Intent(baseContext,MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onTick(millisUntilFinished: Long) {
            }

        }.start()

    }
}