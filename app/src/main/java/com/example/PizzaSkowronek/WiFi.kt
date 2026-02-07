package com.example.PizzaSkowronek

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class WiFi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_wifi)
    }

    fun przejdzDoMenu(view: View) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}