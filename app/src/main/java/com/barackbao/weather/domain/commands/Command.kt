package com.barackbao.weather.domain.commands

/**
 * Created by BarackBao on 2018/2/25.
 */
interface Command<T> {
    fun execute(): T
}