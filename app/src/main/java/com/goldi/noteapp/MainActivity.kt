package com.goldi.noteapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var noteEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteEditText = findViewById(R.id.noteEditText)
        saveButton = findViewById(R.id.saveButton)
        displayTextView = findViewById(R.id.displayTextView)

        saveButton.setOnClickListener {
            val note = noteEditText.text.toString()
            displayTextView.text = note
        }
    }
}
