package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = DiceLogic(6)
        val diceRoll = dice.roll()

        val toast = Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}


class DiceLogic(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}