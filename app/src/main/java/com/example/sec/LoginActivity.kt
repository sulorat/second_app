package com.example.sec

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import com.example.sec.R.*


class TokenStorage(private val context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("token_storage", Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        sharedPreferences.edit().putString("token", token).apply()
    }

    fun getToken(): String? {
        return sharedPreferences.getString("token", null)
    }
}

class LoginActivity : Activity() {
    private lateinit var tokenStorage: TokenStorage
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(layout.login)
        tokenStorage = TokenStorage(this)
        if (tokenStorage.getToken() != null) {

    }




}