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
        builder.setTitle("Wybrano: Pizza Hawajska")
        builder.setMessage("Składniki: Sos pomidorowy, ser, szynka, ananas.\n\nCzy jesteś Włochem?")
        builder.setPositiveButton("Nie") { _, _ ->
            PrzejdzDoRozmiaru("Rodzaj: Pizza Hawajska")
        }
        builder.setNegativeButton("Tak") { _, _ ->
            Toast.makeText(this, "Włosi nie jedzą ananasa na pizzy!", Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }

    fun SurePepperoni(view: View) {
        val intent = Intent(this, PoziomOstrosci::class.java).apply {
            putExtra(EXTRA_MESSAGE, "Rodzaj: Pizza Pepperoni")
        }
        startActivity(intent)
    }

    fun SureWiejska(view: View) {
        PrzejdzDoRozmiaru("Rodzaj: Pizza Wiejska")
    }

    fun SureKebab(view: View) {
        PrzejdzDoRozmiaru("Rodzaj: Pizza Kebab")
    }

    private fun PrzejdzDoRozmiaru(nazwa: String) {
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, nazwa)
        }
        startActivity(intent)
    }
}