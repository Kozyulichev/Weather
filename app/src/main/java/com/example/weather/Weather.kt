package com.example.weather

data class Weather(
    val city: String,
    val temperature:Int,
    val fellsLike:Int,
    val tempMax:Int,
    val tempMin:Int
)

fun getDefaultWeather() = Weather("New-York",22,20,25,17)
