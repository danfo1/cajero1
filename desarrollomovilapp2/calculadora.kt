package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculadora : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        var num1 = findViewById<EditText>(R.id.editTextNum1)
        var num2 = findViewById<EditText>(R.id.editTextNum2)
        var rNum1 = findViewById<TextView>(R.id.textViewNum1)
        var rSimbolo = findViewById<TextView>(R.id.textViewSimbolo)
        var rNum2 = findViewById<TextView>(R.id.textViewNum2)
        var resultado = findViewById<TextView>(R.id.textViewResultadoCalc)




        val sumaBoton = findViewById<Button>(R.id.botonSuma)
        sumaBoton.setOnClickListener {

            var numero1String = num1.text.toString()
            var numero1 = numero1String.toInt()

            var numero2String = num2.text.toString()
            var numero2 = numero2String.toInt()

            var suma = numero1+numero2
            var resultadoString = suma.toString()


            rNum1.setText(numero1String)
            rNum2.setText(numero2String)
            rSimbolo.setText("+")
            resultado.setText(resultadoString)

        }

        val restaBoton = findViewById<Button>(R.id.botonResta)
        restaBoton.setOnClickListener {


            var numero1String = num1.text.toString()
            var numero1 = numero1String.toInt()

            var numero2String = num2.text.toString()
            var numero2 = numero2String.toInt()

            var resta = numero1-numero2
            var resultadoString = resta.toString()


            rNum1.setText(numero1String)
            rNum2.setText(numero2String)
            rSimbolo.setText("-")
            resultado.setText(resultadoString)


        }

        val multiplicacionBoton = findViewById<Button>(R.id.botonMultiplicacion)
        multiplicacionBoton.setOnClickListener {


            var numero1String = num1.text.toString()
            var numero1 = numero1String.toInt()

            var numero2String = num2.text.toString()
            var numero2 = numero2String.toInt()

            var multiplicacion = numero1*numero2
            var resultadoString = multiplicacion.toString()

            rNum1.setText(numero1String)
            rNum2.setText(numero2String)
            rSimbolo.setText("x")
            resultado.setText(resultadoString)


        }

        val dividirBoton = findViewById<Button>(R.id.botonDividir)
        dividirBoton.setOnClickListener {


            var numero1String = num1.text.toString()
            var numero1 = numero1String.toInt()

            var numero2String = num2.text.toString()
            var numero2 = numero2String.toInt()

            var division = numero1/numero2
            var resultadoString = division.toString()

            rNum1.setText(numero1String)
            rNum2.setText(numero2String)
            rSimbolo.setText("/")
            resultado.setText(resultadoString)


        }

        val botonRegresar = findViewById<Button>(R.id.botonCalcRegresar)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, menu::class.java)
            startActivity(intento)
        }




    }
}