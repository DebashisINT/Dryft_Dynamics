package com.dryftdynamics.features.weather.api

import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.task.api.TaskApi
import com.dryftdynamics.features.task.model.AddTaskInputModel
import com.dryftdynamics.features.weather.model.ForeCastAPIResponse
import com.dryftdynamics.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}