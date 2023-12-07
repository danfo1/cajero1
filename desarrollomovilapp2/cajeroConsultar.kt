package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class cajeroConsultar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cajero_consultar)

        var contenidoonsulta = findViewById<TextView>(R.id.textViewConsulta)

        contenidoonsulta.setText("\nNombre se usuario:\n${Cliente.nombre}\n\nSaldo actual:\n$${Cliente.saldoCuenta}")

        val botonRegresar = findViewById<Button>(R.id.botonConsultarRegresar)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, cajero1::class.java)
            startActivity(intento)
        }

    }
}