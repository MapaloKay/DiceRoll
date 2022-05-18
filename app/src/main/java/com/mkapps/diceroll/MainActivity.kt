package com.mkapps.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview : TextView = findViewById(R.id.textView)
        val button : Button = findViewById(R.id.btnRoll)


        button.setOnClickListener {
            val randomInt = (1..6).random()
            textview.setText(randomInt.toString())
        }
    }
}