package com.artimanton.bsx_artim.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.artimanton.bsx_artim.R
import com.artimanton.bsx_artim.model.SplashModel
import com.artimanton.bsx_artim.viewmodel.SplashViewModel

class SplashScreen : AppCompatActivity() {
    private lateinit var splashViewModel:SplashViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        initSplashViewModel()
        observeSplashLiveData()
    }

    private fun initSplashViewModel() {
        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)

    }

    private fun observeSplashLiveData() {
        splashViewModel.initSplashScreen()
        val observer = Observer<SplashModel> {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        splashViewModel.liveData.observe(this, observer)
    }
}