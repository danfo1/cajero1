package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val botonCajero = findViewById<Button>(R.id.botonMenuCajero)
        botonCajero.setOnClickListener {
            val intento = Intent(this, cajero1::class.java)
            startActivity(intento)
        }

        val botonCalculadora = findViewById<Button>(R.id.botonMenuCalculadora)
        botonCalculadora.setOnClickListener {
            val intento = Intent(this, calculadora::class.java)
            startActivity(intento)
        }

        val botonNotas = findViewById<Button>(R.id.botonMenuNotas)
        botonNotas.setOnClickListener {
            val intento = Intent(this, lista::class.java)
            startActivity(intento)
        }

        val botonRegresar = findViewById<Button>(R.id.botonMenuRegresar)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, MainActivity::class.java)
            startActivity(intento)
        }

    }
}