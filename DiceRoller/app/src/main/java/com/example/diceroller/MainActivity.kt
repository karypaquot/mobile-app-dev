package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //var diceImage : ImageView? = null
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        //assign rollDice() as a click handler for the button
        rollButton.setOnClickListener{rollDice()}
        /*
        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{countUp()
        }*/


    }
    private fun rollDice(){

        val randomInt = (1..6).random()
        diceImage = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        /*
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
        */
        //context object
        /*
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show() //show displays the toast
        */
    }
    /*
    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello World"){
            resultText.text = "1"
        }
        else {
            var result = resultText.text.toString().toInt()
            if (result < 6){
                result++
                resultText.text = result.toString()
            }
        }

    }
    */

}