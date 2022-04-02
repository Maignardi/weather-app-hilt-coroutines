package com.example.weather_app_coroutines.api

import com.example.weather_app_coroutines.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Luanda")
    suspend fun getWeather():Response<Weather>

}