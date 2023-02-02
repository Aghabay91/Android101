package com.example.intentapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var result: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.textView)

        val userName:String = intent.getStringExtra("username").toString()
        val userAge:Int = intent.getIntExtra("user_age", 0)

        result.text = "Your name is $userName and your age is $userAge"
    }
}