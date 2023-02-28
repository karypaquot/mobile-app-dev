package com.example.mortgagev2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mortgagev2.databinding.ActivityMainBinding
import android.content.SharedPreferences

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val pf: Prefs = Prefs(this)
    //val mortgage = Mortgage ()
    val mortgage = Mortgage()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pf.setPreferences(mortgage)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setText(mortgage)
    }
    override fun onStart() {
        super.onStart()
        pf.getPreferences(mortgage)
        setText(mortgage)
    }
    fun setText(mortgage: Mortgage)   {
        val amountString = mortgage.getFormattedAmount().toString()
        val yearsString = mortgage.getYears().toString()
        val rateString = String.format("%.1f",(mortgage.getRate() * 100)) + "%"
        val monthlyPaymentString = mortgage.formattedMonthlyPayment()
        val totalPaymentString = mortgage.formattedTotalPayment()

        binding.amount.text = amountString
        binding.years.text = yearsString
        binding.rate.text = rateString
        binding.payment.text = monthlyPaymentString
        binding.total.text= totalPaymentString
    }
    fun modifyData(v: View?) {
        val intent = Intent(this, DataActivity:: class.java)
        this.startActivity(intent)
        val s: SharedPreferences? =
            this!!.getSharedPreferences("Mortgage", Context.MODE_PRIVATE)
        overridePendingTransition(R.anim.slide_from_left, 0)
    }
}
