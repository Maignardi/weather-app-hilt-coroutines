package com.example.weather_app_coroutines.repository

import com.example.weather_app_coroutines.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getWeather() = apiService.getWeather()
}