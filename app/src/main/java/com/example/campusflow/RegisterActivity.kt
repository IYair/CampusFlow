package com.example.campusflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val goLogin = findViewById<TextView>(R.id.go_login)
        goLogin.setOnClickListener{
            goToLogin()
        }

        val registrar = findViewById<Button>(R.id.registrarse)
        registrar.setOnClickListener{
            registro()
        }
    }

    private fun registro(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun goToLogin(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}