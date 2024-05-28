package com.example.sec

import LoginActivity
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View


class OnBoardingActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding)

    }
    fun GoToLogin(v: View?) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}