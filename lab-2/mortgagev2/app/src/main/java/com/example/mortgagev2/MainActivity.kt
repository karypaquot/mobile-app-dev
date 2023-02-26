package com.example.mortgagev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val pf: Prefs = Prefs(this)
    .................................
    pf._____________(_____________)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    }
}