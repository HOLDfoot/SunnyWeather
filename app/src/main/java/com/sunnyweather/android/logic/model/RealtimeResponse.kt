package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Author    ZhuMingren
 * Date      2021/11/25
 * Time      7:04 下午
 * DESC      SunnyWeather
 */
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}