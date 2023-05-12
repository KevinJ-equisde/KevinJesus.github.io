package com.example.lacalcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //0->nada, 1->Suma, 2->Resta, 3->Multiplicacion, 4->Division
    var oper: Int = 0
    var numero1: Double = 0.0
    lateinit var ResultadoTextView: TextView
    lateinit var ResultadoTextView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ResultadoTextView = findViewById(R.id.ResultadoTextView)
        ResultadoTextView2 = findViewById(R.id.ResultadoTextView2)
        val Botondeeliminado: Button = findViewById(R.id.Botondeelmininado)
        val BotondeResultado: Button = findViewById(R.id.BotondeResultado)

        BotondeResultado.setOnClickListener{
                var numero2: Double = ResultadoTextView2.text.toString().toDouble()
                var resp: Double = 0.0

                when(oper){
                    1-> resp = numero1 + numero2
                    2-> resp = numero1 - numero2
                    3-> resp = numero1 * numero2
                    4-> resp = numero1 / numero2
                }

            ResultadoTextView2.setText(resp.toString())
            ResultadoTextView.setText("")
        }

        Botondeeliminado.setOnClickListener {
            ResultadoTextView.setText("")
            ResultadoTextView2.setText("")
            numero1 = 0.0
            oper = 0
        }
    }

    fun presionarDigito(view: View){
      var num2: String = ResultadoTextView2.text.toString()

        when(view.id){
            R.id.ceroBoton -> ResultadoTextView2.setText(num2 + "0")
            R.id.unoBoton -> ResultadoTextView2.setText(num2 + "1")
            R.id.dosBoton -> ResultadoTextView2.setText(num2 + "2")
            R.id.tresBoton -> ResultadoTextView2.setText(num2 + "3")
            R.id.cuatroBoton -> ResultadoTextView2.setText(num2 + "4")
            R.id.cincoBoton -> ResultadoTextView2.setText(num2 + "5")
            R.id.seisBoton -> ResultadoTextView2.setText(num2 + "6")
            R.id.sieteBoton -> ResultadoTextView2.setText(num2 + "7")
            R.id.ochoBoton -> ResultadoTextView2.setText(num2 + "8")
            R.id.nueveBoton -> ResultadoTextView2.setText(num2 + "9")
            R.id.BotonDecimal -> ResultadoTextView2.setText(num2 + ".")
        }


    }

    fun clicOperacion(view: View){
        numero1 = ResultadoTextView2.text.toString().toDouble()
        var numb2_text: String = ResultadoTextView.text.toString()
        when(view.id){
            R.id.AdicionBoton -> {
                ResultadoTextView.setText(numb2_text + "+")
                oper = 1
                }
            R.id.SustraccionBoton->{
                    ResultadoTextView.setText(numb2_text + "-")
                    oper = 2
                }
            R.id.MultiplicarBoton->{
                    ResultadoTextView.setText(numb2_text + "*")
                    oper = 3
                }
            R.id.DividirBoton -> {
                ResultadoTextView.setText(numb2_text + "/")
                oper = 4
                }
            }
        }

    }