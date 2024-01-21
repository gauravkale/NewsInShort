package com.gaurav.newsinshort.data.datasource

import com.gaurav.newsinshort.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse>
}