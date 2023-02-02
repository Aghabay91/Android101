package com.example.intentapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var age: EditText
    private lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextName)
        age = findViewById(R.id.editTextAge)
        send = findViewById(R.id.button)

        send.setOnClickListener {
            val userName:String = name.text.toString()
            val userAge:Int = age.text.toString().toInt()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("username", userName)
            intent.putExtra("user_age", userAge)

            startActivity(intent)

        }
    }
}