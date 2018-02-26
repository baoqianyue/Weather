package com.barackbao.weather.domain.model

/**
 * Created by BarackBao on 2018/2/26.
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<com.barackbao.weather.domain.model.Forecast>) {
    operator fun get(position: Int): Forecast = dailyForecast[position]
    fun size(): Int = dailyForecast.size
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)