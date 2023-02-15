package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //get reference to the done button view
        findViewById<Button>(R.id.done_button).setOnClickListener{
            addNickname(it)
        }
        findViewById<TextView>(R.id.nickname_text).setOnClickListener{
            updateNickname(it)
        }
    }
    private fun addNickname(view: View) {
        //use findviewbyid to get a reference to the edittext fields
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        //set textview the the text that the user enters
        nicknameTextView.text = editText.text
        //change visitbility property
        editText.visibility = View.GONE
        //hide the done button by setting the visibility of the view to GONE
        view.visibility = View.GONE
        //make nickname text visible
        nicknameTextView.visibility = View.VISIBLE
        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun updateNickname (view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)
        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE
        // Set the focus to the edit text.
        editText.requestFocus()
        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)

    }

}