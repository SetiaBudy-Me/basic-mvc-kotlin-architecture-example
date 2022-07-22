package com.l3udy.basicmvckotlin.model

class Data(private val number1: Int, private val number2: Int) : IData {
    override fun result(): Int {
        return number1.times(number2)
    }
}