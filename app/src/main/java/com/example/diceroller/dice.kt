package com.example.diceroller

class dice (val numSides: Int){
    var sides = numSides

    fun roll(): Int {
        return  ((1..sides).random())
    }
}

fun main() {
    val firstdice:dice = dice(6)
    val diceRoll  = firstdice.roll()
}