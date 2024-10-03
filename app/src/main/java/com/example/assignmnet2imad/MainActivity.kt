package com.example.assignmnet2imad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getStartedButton: Button = findViewById(R.id.getStartedButton)
        getStartedButton.setOnClickListener {
             val intent = Intent(this,MainActivity2:: class.java)
                      startActivity(intent)
        }
    }
}