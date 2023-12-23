package com.example.weather.model

import java.io.Serializable
// -273.15

data class WeatherModel(

    val weather: List<WeatherDescriptionModel>,
    val coord: CoordinateModel,
    val main: MainModel,
    val wind: WindModel,
    val cloud: CloudModel,
    val sys: SystemModel,
    val nameCity: String
) : Serializable

data class CoordinateModel(
    val lon: Double,
    val lat: Double
)

data class WeatherDescriptionModel(
    val mainDescription: String,
    val description: String
)


data class MainModel(
    val temp: Double,
    val tempFL: Double,
    val tempMin: Double,
    val tempMax: Double,
    val pressure: Int,
    //давление
    val humidity: Int,
    //влажность
)

data class WindModel(
    val speed: Double,
    val deg: Int
)


data class CloudModel(
    val cloud: Int
)

class SystemModel(
    val country: String,
//   UTC
    val sunrise: Int,
    val sunset: Int
)


