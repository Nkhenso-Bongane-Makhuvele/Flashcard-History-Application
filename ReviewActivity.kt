package com.example.flashcardapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getBooleanArrayExtra("answers")

        val reviewText = findViewById<TextView>(R.id.reviewText)

        val builder = StringBuilder()

        for (i in questions!!.indices) {
            builder.append("${i + 1}. ${questions[i]}\nAnswer: ${answers!![i]}\n\n")
        }

        reviewText.text = builder.toString()
    }
}
