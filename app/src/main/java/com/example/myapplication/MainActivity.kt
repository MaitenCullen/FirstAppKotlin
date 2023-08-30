package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

import androidx.lifecycle.ViewModelProvider
import model.MainViewModel

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val editText1: EditText = findViewById(R.id.editTextText)
        val editText2: EditText = findViewById(R.id.editTextText3)
        val compareButton: Button = findViewById(R.id.button)
        val resultTextView: TextView = findViewById(R.id.viewText)

        compareButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            val areEqual = viewModel.compareTexts(text1, text2)

            if (areEqual) {
                resultTextView.text = "Son iguales! escribiste mucho $text1"
            } else {
                resultTextView.text = "Los textos son distintos $text1 y $text2"
            }
        }
    }
}

