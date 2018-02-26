package com.barackbao.weather.net


import com.barackbao.weather.bean.ForecastResult
import com.google.gson.Gson
import java.net.URL

/**
 * Created by BarackBao on 2018/2/25.
 */
class ForecastRequestByZipCode(private val zipCode:String) {
    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&zip"
    }

    fun execute(): ForecastResult {
        val forecastRequestStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastRequestStr, ForecastResult::class.java)
    }

}