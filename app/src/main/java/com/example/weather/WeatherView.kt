package com.example.weather

import com.example.weather.model.WeatherModel

interface WeatherView {
    fun showWeather(weatherModel: WeatherModel)
    fun showError(error: String)
}