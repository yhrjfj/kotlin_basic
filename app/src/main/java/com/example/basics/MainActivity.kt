package com.example.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText View
        val et : TextView = findViewById(R.id.editText1)

        val editTextInput = et.text

        // Button view
        val btn : Button = findViewById(R.id.button)
        // Handle event click on button
        btn.setOnClickListener(){
            Toast.makeText(this@MainActivity, "Button has been clicked", Toast.LENGTH_LONG).show()
        }
    }
}