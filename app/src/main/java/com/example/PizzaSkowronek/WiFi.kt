package com.example.PizzaSkowronek

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class WiFi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_wifi)
    }

    fun PrzejdzDoMenu(view: View) {
        val s = findViewById<SwitchCompat>(R.id.wifiSwitch)

        if (s != null && s.isChecked) {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "NAJPIERW WŁĄCZ WIFI!", Toast.LENGTH_SHORT).show()
        }
    }
}