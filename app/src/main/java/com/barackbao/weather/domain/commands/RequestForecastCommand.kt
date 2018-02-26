package com.barackbao.weather.domain.commands

import com.barackbao.weather.bean.ForecastDataMapper
import com.barackbao.weather.bean.ForecastResult
import com.barackbao.weather.domain.model.ForecastList
import com.barackbao.weather.net.ForecastRequestByZipCode

/**
 * Created by BarackBao on 2018/2/26.
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequestByZipCode(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}