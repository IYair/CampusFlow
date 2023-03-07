package com.example.campusflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para navegar a la pantalla de registro desde el inicio de sesión
        val goRegister = findViewById<TextView>(R.id.go_registro)
        goRegister.setOnClickListener{
            goToRegister()
        }
    }

    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}