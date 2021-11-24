package com.sunnyweather.android.logic.model
import com.google.gson.annotations.SerializedName

/**
 * Author    ZhuMingren
 * Date      2021/11/24
 * Time      11:04 上午
 * DESC      SunnyWeather
 */
data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)
data class Location(val lng: String, val lat: String)