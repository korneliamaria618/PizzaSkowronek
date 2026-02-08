package com.example.PizzaSkowronek

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.PizzaSkowronek.MESSAGE"

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_menu)
    }

    fun SureHawajska(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("WYBRANO: PIZZA HAWAJSKA")
        builder.setMessage("Składniki: Sos, Ser, Szynka, Ananas.\n\nCzy jesteś Włochem?")
        builder.setPositiveButton("NIE") { _, _ ->
            PrzejdzDalej("Rodzaj: Pizza Hawajska")
        }
        builder.setNegativeButton("TAK") { _, _ ->
            Toast.makeText(this, "WŁOSI NIE JEDZĄ ANANASA NA PIZZY!!!", Toast.LENGTH_LONG).show()
        }
        builder.show()
    }

    fun SurePepperoni(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("WYBRANO: PIZZA PEPPERONI")
        builder.setMessage("Składniki: Sos, Ser, Podwójne Salami Pepperoni.\n\nUwaga: Może być pikantna!!!")
        builder.setPositiveButton("ZAMAWIAM") { _, _ ->
            val intent = Intent(this, PoziomOstrosci::class.java).apply {
                putExtra(EXTRA_MESSAGE, "Rodzaj: Pizza Pepperoni")
            }
            startActivity(intent)
        }
        builder.setNegativeButton("POWRÓT", null)
        builder.show()
    }

    fun SureWiejska(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("WYBRANO: PIZZA WIEJSKA")
        builder.setMessage("Składniki: Sos, Ser, Kiełbasa, Boczek, Cebula, Ogórek kiszony.")
        builder.setPositiveButton("ZAMAWIAM") { _, _ ->
            PrzejdzDalej("Rodzaj: Pizza Wiejska")
        }
        builder.setNegativeButton("POWRÓT", null)
        builder.show()
    }

    fun SureKebab(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("WYBRANO: PIZZA KEBAB")
        builder.setMessage("Składniki: Sos, Ser, Mięso Kebab, Cebula czerwona, Sos czosnkowy.")
        builder.setPositiveButton("ZAMAWIAM") { _, _ ->
            PrzejdzDalej("Rodzaj: Pizza Kebab")
        }
        builder.setNegativeButton("POWRÓT", null)
        builder.show()
    }

    private fun PrzejdzDalej(wiadomosc: String) {
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, wiadomosc)
        }
        startActivity(intent)
    }
}