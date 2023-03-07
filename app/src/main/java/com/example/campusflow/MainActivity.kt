package com.example.campusflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para navegar a la pantalla de registro desde el inicio de sesión
        val goRegister = findViewById<TextView>(R.id.go_registro)
        goRegister.setOnClickListener{
            goToRegister()
        }
        val iniciarSesion = findViewById<Button>(R.id.iniciar_sesion)
        iniciarSesion.setOnClickListener{
            login()
        }

    }
    private fun login(){
        if(true){
            val intent = Intent(this, MenuActivity::class.java)
            val toast = Toast.makeText(this, "Sesión iniciada, bienvenido", Toast.LENGTH_SHORT)
            toast.show()
            startActivity(intent)
        }else{
            val toast = Toast.makeText(this, "Credenciales no válidas, inténtalo de nuevo", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}