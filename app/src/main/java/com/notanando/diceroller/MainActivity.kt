package com.notanando.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.notanando.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton = binding.rollButton

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText = binding.resultText

        val randomInt = Random().nextInt(6) + 1

        resultText.text = randomInt.toString()
    }
}