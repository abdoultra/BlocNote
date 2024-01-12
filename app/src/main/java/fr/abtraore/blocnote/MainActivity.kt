package fr.abtraore.blocnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun  addButtonTouched(button:View) {
        val userInput = userField.text
        val existingText = fullTextView.text
        fullTextView.text = "$userInput\n$existingText"
        userField.text = null
    }
}