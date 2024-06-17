package com.example.sec

import LoginActivity
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button


class OnBoardingActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding)
        val button = findViewById<Button>(R.id.ToLogin)
        button.setOnClickListener {val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
    fun GoToLogin(v: View?) {

    }
}