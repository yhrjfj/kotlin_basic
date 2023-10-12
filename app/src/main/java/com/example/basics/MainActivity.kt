package com.example.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // EditText View
//        val et : TextView = findViewById(R.id.editText1)
//
//        // Button view
//        val btn : Button = findViewById(R.id.button)
//        // Handle event click on button
//        btn.setOnClickListener(){
//
//            val editTextInput = et.text
//
//            Toast.makeText(this@MainActivity, ""+editTextInput, Toast.LENGTH_LONG).show()
//        }

//        // Image view
//        val img :ImageView = findViewById(R.id.img)
//
//        img.setImageResource(R.drawable.image)

        val name : EditText = findViewById(R.id.givenName)

        val button : Button = findViewById(R.id.button)

        val image : ImageView = findViewById(R.id.img)

        button.setOnClickListener() {
            val editTextInput = name.text
            Toast.makeText(this@MainActivity,"Wellcome "+editTextInput,Toast.LENGTH_LONG).show()
            image.setImageResource(R.drawable.screenshot)
        }
    }
}