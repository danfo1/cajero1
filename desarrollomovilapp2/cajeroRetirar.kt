package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class cajeroRetirar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cajero_retirar)

        var valorRetiro = findViewById<EditText>(R.id.editTextRetirarValor)


        var botonAceptar = findViewById<Button>(R.id.botonRetiroAceptar)

        val resultadoRetiro = findViewById<TextView>(R.id.editTextRetiroResultado)

        botonAceptar.setOnClickListener {

            var valorRetiroString = valorRetiro.text.toString()
            var valorRetiroInt = valorRetiroString.toInt()


            if (valorRetiroInt > 0){


                if (valorRetiroInt<=Cliente.saldoCuenta){
                    var saldoAnterior = Cliente.saldoCuenta
                    Cliente.saldoCuenta-=valorRetiroInt
                    resultadoRetiro.setText("El saldo de su cuenta era $${saldoAnterior}, usted hizo un retiro exitoso por un monto de $${valorRetiroInt}, por ende, su saldo actual es $${Cliente.saldoCuenta}")
                    valorRetiro.setText("")
                }else{
                    resultadoRetiro.setText("La cantidad de dinero que usted desea retirar supera el valor del saldo de su cuenta, por ende, la transaccion no se puede realizar")
                    valorRetiro.setText("")

                }
            }else{
                resultadoRetiro.setText("El numero ingresado no es valido")
                valorRetiro.setText("")
            }
        }

        val botonRegresar = findViewById<Button>(R.id.botonRetirarRegresar)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, cajero1::class.java)
            startActivity(intento)
        }
        
    }
}