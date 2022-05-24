package com.todayseyebrow.booksearchapp.data.api

import com.todayseyebrow.booksearchapp.data.model.SearchResponse
import com.todayseyebrow.booksearchapp.util.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookSearchApi {

    @Headers("Authorization: KakaoAk $API_KEY")
    @GET("v3/search/book")
    suspend fun searchBooks(
        @Query("query") query: String,
        @Query("sort") sort: String,
        @Query("page") page: String,
        @Query("size") size: String
    ): Response<SearchResponse>
}