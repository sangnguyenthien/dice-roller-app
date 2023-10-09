package com.example.hellognas

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll 2 dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        // call rollDice() when the button is clicked
        rollButton.setOnClickListener { rollDice() }

    }

    /**
     * Roll 2 dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll()

        // Update the screen with the first dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val res = when(diceRoll)
        {
            1 -> R.drawable.dice_1_b_svg
            2 -> R.drawable.dice_2_b_svg
            3 -> R.drawable.dice_3_b_svg
            4 -> R.drawable.dice_4_b_svg
            5 -> R.drawable.dice_5_b_svg
            6 -> R.drawable.dice_6_b_svg
            else -> 0
        }

        val resultImageView: ImageView = findViewById(R.id.imageView)
        resultImageView.setImageResource(res)

        //


        // Update the screen with the second dice roll

        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()

        val res2 = when(diceRoll2)
        {
            1 -> R.drawable.dice_1_b_svg
            2 -> R.drawable.dice_2_b_svg
            3 -> R.drawable.dice_3_b_svg
            4 -> R.drawable.dice_4_b_svg
            5 -> R.drawable.dice_5_b_svg
            6 -> R.drawable.dice_6_b_svg
            else -> 0
        }

        val resultImageView2: ImageView = findViewById(R.id.imageView2)
        resultImageView2.setImageResource(res2)
    }


}

class Dice(private val numberOfSides: Int) {
    // roll a dice
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}