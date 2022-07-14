package com.example.diceroller

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
fun getDiceImage(num:Int):Int {
    return when(num) {
        1 -> (R.drawable.dice_1)
        2 -> (R.drawable.dice_2)
        3 -> (R.drawable.dice_3)
        4 -> (R.drawable.dice_4)
        5 -> (R.drawable.dice_5)
        else -> {
            (R.drawable.dice_6)
        }
    }

}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
        var diceImage :ImageView = findViewById(R.id.imageView2)
            diceImage.setImageResource(getDiceImage(dice(6).roll()))
        }
    }
}