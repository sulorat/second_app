package com.example.sec

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sec.R.*


class LoginActivity : Activity() {

    private lateinit var pass : EditText
    private lateinit var email : EditText
    private lateinit var toMaim : Button
    private lateinit var _save: SharedPreferences
    public val savePass = "//////"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.login)

        pass = findViewById(R.id.login_pass)
        email = findViewById(R.id.login_email)
        toMaim = findViewById(R.id.ToMainMenu)


        toMaim.setOnClickListener {
            saveData()
            val intent = Intent(this, FullMainActivity::class.java)

            startActivity(intent)
        }
    }

        private fun saveData() {
            _save = getSharedPreferences("MyPref", MODE_PRIVATE)
            val editor = _save.edit()
            editor.putString(savePass, pass.text.toString())
            editor.apply()
            Toast.makeText(this, "Pass saved", Toast.LENGTH_SHORT).show()
        }


}