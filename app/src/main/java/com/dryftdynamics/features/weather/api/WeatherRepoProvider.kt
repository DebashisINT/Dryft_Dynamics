package com.dryftdynamics.features.weather.api

import com.dryftdynamics.features.task.api.TaskApi
import com.dryftdynamics.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}