package com.example.user_interactions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var showToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast = findViewById(R.id.buttonShowToast)
        showToast.setOnClickListener {
            Toast.makeText(applicationContext, "This is a toast message", Toast.LENGTH_LONG).show()
        }

    }
}