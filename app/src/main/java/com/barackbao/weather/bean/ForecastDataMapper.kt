package com.barackbao.weather.bean

import com.barackbao.weather.domain.model.ForecastList
import java.text.DateFormat
import java.util.*
import com.barackbao.weather.domain.model.Forecast as ModelForecast

/**
 * Created by BarackBao on 2018/2/26.
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ForecastResult):ForecastList{
        return ForecastList(forecast.city.name,forecast.city.country,
                convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description, forecast.temp.max.toInt(),
                forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val dateformat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return dateformat.format(date * 1000)
    }
}