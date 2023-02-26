package com.example.mortgagev2
import android.content.Context
import android.content.SharedPreferences
import android.util.Log

class Prefs (context1: Context) {
    private var context: Context? = context1
    private var amount:Float=200000.0f
    private var years: Int =15
    private var rate: Float =0.035f


    fun setPreferences(mort: Mortgage) {
        var s: SharedPreferences? =
            context!!.getSharedPreferences("Mortgage", Context.MODE_PRIVATE)
        var editor = s?.edit()
        if (editor != null) {
            editor.putFloat(Mortgage.PREFERENCE_AMOUNT, mort.getAmount())
        }
        if (editor != null) {
            editor.putInt(Mortgage.PREFERENCE_YEARS, mort.getYears())
        }
        ___________________________________
        ()
    }

    fun getPrefernces(mort: Mortgage)
    {

        var s: SharedPreferences? = _____________________________________
        if (s != null) {
            mort.setYears(s.getInt(Mortgage.PREFERENCE_YEARS, 30))
            ______________________________________________________
            ______________________________________________________
        }

    }

}