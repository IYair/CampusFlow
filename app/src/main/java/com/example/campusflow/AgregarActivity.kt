package com.example.campusflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AgregarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)

        val cancelar = findViewById<Button>(R.id.btn_Cancelar)

        cancelar.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val agregar = findViewById<Button>(R.id.btn_Agregar)

        agregar.setOnClickListener {
            val toast = Toast.makeText(this, "Pendiente Agregado", Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}