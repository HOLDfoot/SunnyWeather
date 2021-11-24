package com.sunnyweather.android.logic.network

import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.Query

/**
 * Author    ZhuMingren
 * Date      2021/11/24
 * Time      5:18 下午
 * DESC      SunnyWeather
 */
interface PlaceService {

    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}