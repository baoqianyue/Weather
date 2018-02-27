package com.barackbao.weather.extensions

import android.content.Context
import android.widget.Toast

/**
 * Created by BarackBao on 2018/2/25.
 */


public fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}