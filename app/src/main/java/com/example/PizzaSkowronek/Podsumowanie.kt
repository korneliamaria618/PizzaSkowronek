package com.example.PizzaSkowronek

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Podsumowanie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_podsumowanie)

        val zamowienie = intent.getStringExtra(EXTRA_MESSAGE)
        findViewById<TextView>(R.id.wielkosc).text = zamowienie ?: "Błąd zamówienia"
    }
}