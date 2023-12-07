package com.example.desarrollomovilapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class cajeroConsignar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cajero_consignar)

        var valorConsignacion = findViewById<EditText>(R.id.editTextConsignarValor)


        var botonAceptar = findViewById<Button>(R.id.botonConsignacionAceptar)

        val resultadoConsignacion = findViewById<TextView>(R.id.editTextConsignacionResultado)

        botonAceptar.setOnClickListener {

            var valorCOnsignacionString = valorConsignacion.text.toString()
            var valorConsignacionInt = valorCOnsignacionString.toInt()


            if (valorConsignacionInt > 0){
                var saldoAnterior = Cliente.saldoCuenta
                Cliente.saldoCuenta+=valorConsignacionInt

                resultadoConsignacion.setText("El saldo de su cuenta era $${(saldoAnterior)}, usted hizo una consignacion exitosa por un monto de $${valorConsignacionInt}, por ende su saldo actual es: $${Cliente.saldoCuenta}")
                valorConsignacion.setText("")
            }else{
                resultadoConsignacion.setText("El numero ingresado no es valido")
                valorConsignacion.setText("")
            }
        }

        val botonRegresar = findViewById<Button>(R.id.botonConsignacionRegresar)
        botonRegresar.setOnClickListener {
            val intento = Intent(this, cajero1::class.java)
            startActivity(intento)
        }



    }
}