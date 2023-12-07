package com.example.desarrollomovilapp2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val nota = findViewById<TextView>(R.id.editTextTextLista)
        val guardarNota = findViewById<Button>(R.id.botonListaGuardar)
        if (fileList().contains("notas.txt")){
            try {
                val archivo = InputStreamReader(openFileInput("notas.txt"))
                val lectura = BufferedReader(archivo)
                var linea = lectura.readLine()
                var lecturaTotal = StringBuilder()
                while (linea != null){
                    lecturaTotal.append(linea+"\n")
                    linea = lectura.readLine()
                }
                lectura.close()
                archivo.close()
                nota.setText(lecturaTotal)
            }catch (e: IOException){
                Toast.makeText(this, "No existe el archivo", Toast.LENGTH_LONG).show()
            }


        }
        guardarNota.setOnClickListener {
            try {
                val archivo = OutputStreamWriter(openFileOutput("notas.txt", Activity.MODE_PRIVATE))
                archivo.write(nota.text.toString())
                archivo.flush()
                archivo.close()

                Toast.makeText(this, "Los datos se registraron correctamente", Toast.LENGTH_LONG).show()
                finish()

            } catch (e: IOException) {
                // Manejar la excepción aquí si hay algún problema con la escritura del archivo
                Toast.makeText(this, "Error al guardar la nota", Toast.LENGTH_LONG).show()
            }
        }

        val botonRegresar = findViewById<Button>(R.id.botonListaRegresar)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, menu::class.java)
            startActivity(intento)
        }

    }
}