package com.example.weather.model

import com.example.weather.model.WeatherModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

//"https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid=01adbc59aac17517263cf4cb82c96f5c&q=Bishkek
interface WeatherApi {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("appid") key: String = "01adbc59aac17517263cf4cb82c96f5c",
        @Query("units") units : String = "metric "
    ): Call<WeatherModel>
}
