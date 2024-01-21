package com.gaurav.newsinshort.data.api

import com.gaurav.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "e678ec001ffd4e2c84171834372dbe38"
    ): Response<NewsResponse>

}