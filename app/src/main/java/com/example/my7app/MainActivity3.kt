package com.example.my7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    private lateinit var fourthActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        fourthActivityButton = findViewById(R.id.three_button)
        fourthActivityButton.setOnClickListener {
            val mainActivityIntent: Intent = Intent(this, MainActivity::class.java)
            startActivity(mainActivityIntent)
        }
    }
}