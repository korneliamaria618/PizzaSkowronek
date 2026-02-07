package com.example.PizzaSkowronek

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class PoziomOstrosci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pepperoni_poziomostrosci)

        val alert = AlertDialog.Builder(this)
        alert.setTitle("UWAGA!!!")
        alert.setMessage("Nasza pizza Pepperoni jest naprawdę ostra!")
        alert.setPositiveButton("Rozumiem", null)
        alert.show()

        findViewById<ConstraintLayout>(R.id.background).setBackgroundColor(Color.RED)
    }

    fun LvlPiripiri(view: View) {
        val poprzednie = intent.getStringExtra(EXTRA_MESSAGE) ?: ""
        val menu = poprzednie + "Ostrość: Piri-Piri, "
        val intent = Intent(this, Rozmiar::class.java).apply { putExtra(EXTRA_MESSAGE, menu) }
        startActivity(intent)
    }

    fun LvlWasabi(view: View) {
        val poprzednie = intent.getStringExtra(EXTRA_MESSAGE) ?: ""
        val menu = poprzednie + "Ostrość: Wasabi, "
        val intent = Intent(this, Rozmiar::class.java).apply { putExtra(EXTRA_MESSAGE, menu) }
        startActivity(intent)
    }

    fun LvlJalapeno(view: View) {
        val poprzednie = intent.getStringExtra(EXTRA_MESSAGE) ?: ""
        val menu = poprzednie + "Ostrość: Jalapeño, "
        val intent = Intent(this, Rozmiar::class.java).apply { putExtra(EXTRA_MESSAGE, menu) }
        startActivity(intent)
    }
}