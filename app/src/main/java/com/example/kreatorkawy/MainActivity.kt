package com.example.kreatorkawy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.RadioGroup


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val obrazekKawy = findViewById<ImageView>(R.id.coffeeImage)
        val mapaObrazkow = mapOf(
            R.id.radiobutton_Espresso to R.drawable.espresso,
            R.id.radiobutton_Capuccino to R.drawable.capuccino,
            R.id.radiobutton_Latte to R.drawable.latte
        )

        findViewById<RadioGroup>(R.id.coffeeTypeGroup).setOnCheckedChangeListener { _, wybraneId ->
            obrazekKawy.setImageResource(mapaObrazkow[wybraneId] ?: R.drawable.espresso)
        }
        }
    }
