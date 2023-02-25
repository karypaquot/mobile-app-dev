package com.example.mortgagev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun modifyData(view: View){
        val myIntent = Intent(this, DataActivity:: class.java)
        this.startActivity(myIntent)
    }
}