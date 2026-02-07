package com.example.PizzaSkowronek

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Ciasto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_ciasto)
    }

    fun CienkieCiasto(view: View) {
        val dane = (intent.getStringExtra(EXTRA_MESSAGE) ?: "") + "Grubość ciasta: Cienkie."
        val intent = Intent(this, Podsumowanie::class.java).apply { putExtra(EXTRA_MESSAGE, dane) }
        startActivity(intent)
    }

    fun GrubeCiasto(view: View) {
        val dane = (intent.getStringExtra(EXTRA_MESSAGE) ?: "") + "Grubość ciasta: Grube."
        val intent = Intent(this, Podsumowanie::class.java).apply { putExtra(EXTRA_MESSAGE, dane) }
        startActivity(intent)
    }
}