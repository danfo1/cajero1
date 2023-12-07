package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cajero1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cajero)

        val botonConsignar = findViewById<Button>(R.id.botonCajeroConsignar)
        botonConsignar.setOnClickListener {
            val intento = Intent(this, cajeroConsignar::class.java)
            startActivity(intento)
        }

        val botonRetirar = findViewById<Button>(R.id.botonCajeroRetirar)
        botonRetirar.setOnClickListener {
            val intento = Intent(this, cajeroRetirar::class.java)
            startActivity(intento)
        }

        val botonConsultar = findViewById<Button>(R.id.botonCajeroConsultar)
        botonConsultar.setOnClickListener {
            val intento = Intent(this, cajeroConsultar::class.java)
            startActivity(intento)
        }

        val botonRegresar = findViewById<Button>(R.id.botonCajeroSalir)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, menu::class.java)
            startActivity(intento)
        }

    }
}