package com.example.anything_projects

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var doMagic:Button
    lateinit var myButton: Button
    lateinit var mytext:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    doMagic = findViewById(R.id.doMagic)
        doMagic.setOnClickListener {
            doMagic.setBackgroundColor(Color.CYAN)
        }
    myButton = findViewById(R.id.myButton)
        myButton.setOnClickListener {
            myButton.setTextColor(Color.MAGENTA)
        }
    mytext = findViewById(R.id.textExample)
    mytext.setOnClickListener {
        mytext.setText("Change world")
    }
    }
    }
