package com.example.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    // Parallel arrays
  
    private val questions = arrayOf(
        "Nelson Mandela became president in 1994",
        "World War II ended in 1945",
        "The Roman Empire fell in 1066",
        "The Great Wall is in India",
        "Apartheid ended in 1994"
    )

    private val answers = arrayOf(true, true, false, false, true)

    private var currentIndex = 0
    private var score = 0

    lateinit var questionText: TextView
    lateinit var feedbackText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionText = findViewById(R.id.questionText)
        feedbackText = findViewById(R.id.feedbackText)

        val trueBtn = findViewById<Button>(R.id.trueBtn)
        val falseBtn = findViewById<Button>(R.id.falseBtn)
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        loadQuestion()

        trueBtn.setOnClickListener { checkAnswer(true) }
        falseBtn.setOnClickListener { checkAnswer(false) }

        nextBtn.setOnClickListener {
            currentIndex++

            if (currentIndex < questions.size) {
                loadQuestion()
                feedbackText.text = ""
            } else {
                Log.d("QuizActivity", "Quiz finished. Score: $score")

                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("questions", questions)
                intent.putExtra("answers", answers)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun loadQuestion() {
        Log.d("QuizActivity", "Loading question $currentIndex")
        questionText.text = questions[currentIndex]
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val correct = answers[currentIndex]

        if (userAnswer == correct) {
            feedbackText.text = "Correct!"
            score++
            Log.d("QuizActivity", "Correct answer. Score: $score")
        } else {
            feedbackText.text = "Incorrect"
            Log.d("QuizActivity", "Wrong answer")
        }
    }
}
