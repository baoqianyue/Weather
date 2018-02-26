package com.barackbao.weather.domain.model

import com.barackbao.weather.bean.City
import com.barackbao.weather.bean.Forecast

/**
 * Created by BarackBao on 2018/2/26.
 */
data class ForecastList(val id: Long, val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)