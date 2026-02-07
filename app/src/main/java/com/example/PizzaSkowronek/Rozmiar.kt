package com.example.PizzaSkowronek

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Rozmiar : AppCompatActivity() {

    private var wiadomoscZPoprzedniegoEkranu: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_rozmiar)

        wiadomoscZPoprzedniegoEkranu = intent.getStringExtra(com.example.PizzaSkowronek.EXTRA_MESSAGE) ?: ""
    }

    fun MalaPizza(view: View) {
        PrzejdzDoCiasta("Rozmiar: Mała (30cm)")
    }

    fun SredniaPizza(view: View) {
        PrzejdzDoCiasta("Rozmiar: Średnia (40cm)")
    }

    fun DuzaPizza(view: View) {
        PrzejdzDoCiasta("Rozmiar: Duża (50cm)")
    }

    private fun PrzejdzDoCiasta(rozmiar: String) {
        val intent = Intent(this, Ciasto::class.java).apply {
            putExtra(com.example.PizzaSkowronek.EXTRA_MESSAGE, "$wiadomoscZPoprzedniegoEkranu, $rozmiar")
        }
        startActivity(intent)
    }
}