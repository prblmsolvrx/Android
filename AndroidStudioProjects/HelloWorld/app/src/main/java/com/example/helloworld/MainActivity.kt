package com.example.yourappname

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.helloTextView)
        helloTextView.setOnClickListener {
            // You can add any action you want when the TextView is clicked
            // For now, let's just change the text
            helloTextView.text = "Hello Clicked!";
        }
    }
}
