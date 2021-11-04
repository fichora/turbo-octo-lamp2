package com.ksu.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomizebutton: Button = findViewById(R.id.randomizeButton)

       randomize()

        randomizebutton.setOnClickListener {
          randomize()
        }
    }

    fun randomize(){
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        val randomValue = Random.nextInt(100)
        helloTextView.text = randomValue.toString()

    }

}
