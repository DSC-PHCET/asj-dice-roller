package com.finite.day02asj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Hooks
        val diceValue: ImageView = findViewById(R.id.diceValue)
        val button: Button = findViewById(R.id.button)

        // OnClick Listener for the Button
        button.setOnClickListener(View.OnClickListener {

            val number = (1..6).random()

            when(number) {

                1 -> diceValue.setImageResource(R.drawable.dice_1)
                2 -> diceValue.setImageResource(R.drawable.dice_2)
                3 -> diceValue.setImageResource(R.drawable.dice_3)
                4 -> diceValue.setImageResource(R.drawable.dice_4)
                5 -> diceValue.setImageResource(R.drawable.dice_5)
                else -> {
                    diceValue.setImageResource(R.drawable.d6)
                }
            }

            // Toast message
            Toast.makeText(this,"Number is : $number",Toast.LENGTH_SHORT).show()

        })
    }
}