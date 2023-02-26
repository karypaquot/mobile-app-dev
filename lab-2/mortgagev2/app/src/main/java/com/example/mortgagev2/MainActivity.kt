package com.example.mortgagev2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mortgagev2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val pf: Prefs = Prefs(this)
    val mortgage: Mortgage = Mortgage()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pf.setPreferences(mortgage)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun modifyData(v: View?) {
        overridePendingTransition(R.anim.slide_from_left, R.anim.fade_in_and_scale)
    }
}
