package com.NBM.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "App started")

        val startBtn = findViewById<Button>(R.id.startBtn)

        startBtn.setOnClickListener {
            Log.d("MainActivity", "Start button clicked")

            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}
