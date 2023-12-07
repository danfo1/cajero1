package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuario = findViewById<EditText>(R.id.editTextUsuario)

        val contrasena = findViewById<EditText>(R.id.editTextContraseña)

        val botonIniciar = findViewById<Button>(R.id.botonIniciar)

        val resultado = findViewById<TextView>(R.id.textViewResultado)

        botonIniciar.setOnClickListener {
            Cliente.nombre = usuario.text.toString()
            if (usuario.text.toString().equals("Valentina") && contrasena.text.toString().equals("admin")){
                resultado.setText("Bienvenid@ ${usuario.text}")
                Handler().postDelayed({
                    val intento = Intent(this, menu::class.java)
                    startActivity(intento)
                }, 1000)

            }else{
                resultado.setText("Nombre de usuario o contraseña incorrectos")
            }
        }






    }
}