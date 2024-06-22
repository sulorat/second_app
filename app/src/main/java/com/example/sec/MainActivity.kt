package com.example.sec

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var logAct :LoginActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splashscreen)

        android.os.Handler().postDelayed({
            logAct = LoginActivity()
            val sPref = getSharedPreferences("MyPref", MODE_PRIVATE)
            val savedPass = sPref.getString(logAct.savePass,"")
            if(savedPass !="//////"){
                val main = Intent(this, FullMainActivity::class.java)
                startActivity(main)
            }
            val onBoard = Intent(this, OnBoardingActivity::class.java)
            startActivity(onBoard)

            finish()
        }, 3000)

    }
}