package com.pjurado.tiempo.servidor

import com.pjurado.tiempo.servidor.model.RemoteResult
import retrofit2.http.GET
import retrofit2.http.Query

interface RemoteService {
    //https://api.openweathermap.org/data/2.5/onecall?lat=33.44&lon=-94.04&appid=6f89c731058632df01658d7865b0d166

    @GET("onecall")
    suspend fun pronosticoCoord(@Query("lat") lat: String, @Query("lon") lon: String, @Query("appid") appid: String): RemoteResult

}