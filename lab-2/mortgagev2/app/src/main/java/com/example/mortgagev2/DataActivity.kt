package com.example.mortgagev2

import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_data);
        binding = ActivityDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonDone.setOnClickListener { view: View ->
            goBack(view)
        }
        updateView()
    }
    fun updateView()
    {   val rb10 = binding.ten
        val rb15 = ___________________

        if( mortgage.getYears( ) == 10 ) {
            rb10.setChecked( true );
        } else if( ____________________ ) {
            ________________________________
        } // else do nothing (default is 30)
        val rateET = binding.dataRate
        rateET.setText(mortgage._________________toString())

        val amountET = _____________________________

    }
    fun updateMortgageObject()
    {   val p = Prefs(this)

        val amountET = binding.dataAmount
        val rb10 = _______________

        val rb15 = ________________
        var years = 30
        if (rb10.isChecked)
            years = 10
        else if (rb15.isChecked)
            _____________________
        mortgage.setYears(years)
        val rateET = binding.dataRate
        val rateString:String = rateET.getText().toString()
        val amountString = amountET.text.toString()
        try {
            val amount = amountString.toFloat()
            mortgage.setAmount(amount)
            val rate: Float = rateString.toFloat()
            ____________________________
            p.setPreferences(mortgage)

        } catch (nfe: NumberFormatException) {
            mortgage.setAmount(100000.0f)
            mortgage.setRate(.035f)
        }
    }
    fun goBack(v: View?) {
        updateMortgageObject()
        finish()
        overridePendingTransition(______________________, _____)
    }
    fun updateMortgageObject()
    {   val p = Prefs(_____________)
        val amountET = binding.dataAmount
        val rb10 = binding.ten
        val rb15 = binding.fifteen
        var years = 30
        if (rb10.isChecked)
            years = 10
        else if (rb15.isChecked)
            years = 15
        mortgage.setYears(years)
        val rateET = binding.dataRate
        val rateString:String = rateET.getText().toString()
        val amountString = amountET.text.toString()
        try {
            val amount = amountString.toFloat()
            _________________________________
            val rate: Float = rateString.toFloat()
            _________________________
            p._____________________(__________________________)

        } catch (nfe: NumberFormatException) {
            mortgage.setAmount(100000.0f)
            mortgage.setRate(.035f)
        }

    }

}
