package com.example.example_anything2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var ok: Button
    lateinit var result: TextView

    lateinit var myImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextName)
        ok = findViewById(R.id.buttonOk)
        result = findViewById(R.id.myResult)

        myImage = findViewById(R.id.imageView)

        ok.setOnClickListener {

            myImage.setImageResource(R.drawable.second_image)

            /*
            var userName: String = name.text.toString()
            result.setText(userName)

             */
        }

    }
}