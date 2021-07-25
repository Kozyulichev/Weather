package com.example.weather

interface Repository {

    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather

}