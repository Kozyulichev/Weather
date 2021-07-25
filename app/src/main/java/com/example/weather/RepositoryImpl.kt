package com.example.weather

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = getDefaultWeather()

    override fun getWeatherFromLocalStorage() = getDefaultWeather()

}