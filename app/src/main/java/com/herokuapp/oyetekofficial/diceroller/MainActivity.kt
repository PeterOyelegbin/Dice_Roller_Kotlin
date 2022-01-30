package com.herokuapp.oyetekofficial.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marquee = findViewById<TextView>(R.id.txtMarquee)
        marquee.setSingleLine()
        marquee.ellipsize = TextUtils.TruncateAt.MARQUEE
        marquee.marqueeRepeatLimit = -1
        marquee.isSelected = true

        val roll = findViewById<Button>(R.id.btnRoll)

        roll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawDice1 = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val dice1 = findViewById<ImageView>(R.id.diceImg1)
        dice1.setImageResource(drawDice1)

        val drawDice2 = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val dice2 = findViewById<ImageView>(R.id.diceImg2)
        dice2.setImageResource(drawDice2)
    }
}