package com.example.my7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var nextActivityButton: Button
        lateinit var threeActivityButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            nextActivityButton = findViewById(R.id.first_button)
            nextActivityButton.setOnClickListener {
                val secondActivityIntent: Intent = Intent(this, MainActivity2::class.java)
                startActivity(secondActivityIntent)
            }

        threeActivityButton = findViewById(R.id.next_button)
        threeActivityButton.setOnClickListener {
            val thirdActivityIntent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(thirdActivityIntent)
        }
    }
}