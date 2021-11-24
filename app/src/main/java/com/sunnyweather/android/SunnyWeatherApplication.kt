package com.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * Author    ZhuMingren
 * Date      2021/11/24
 * Time      10:55 上午
 * DESC      SunnyWeather
 */
class SunnyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "cIRs88l1fVShY2wN"

        lateinit var context : Context;
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}