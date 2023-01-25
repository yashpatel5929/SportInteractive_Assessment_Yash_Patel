package com.release.sportzinteractive.network

import com.release.sportzinteractive.model.MatchDetailResponseModel
import com.release.sportzinteractive.model.Matchdetail
import com.release.sportzinteractive.model.SecondMatchDetailResponseModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiServices {

    @GET("nzin01312019187360.json")
    suspend fun getAllMatchDetail() : Response<MatchDetailResponseModel>

    @GET("sapk01222019186652.json")
    suspend fun getSecondMatchDetail() : Response<SecondMatchDetailResponseModel>

    companion object {
        var apiService: ApiServices? = null
        fun getInstance() : ApiServices {
            if (apiService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://demo.sportz.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                apiService = retrofit.create(ApiServices::class.java)
            }
            return apiService!!
        }

    }
}