package com.example.my7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    private lateinit var fourthActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        fourthActivityButton = findViewById(R.id.three_button)
        fourthActivityButton.setOnClickListener {
            val mainActivity3Intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(mainActivity3Intent)
        }
    }
}