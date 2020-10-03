package com.example.newyorktimesbestsellerbooks.data

import com.example.newyorktimesbestsellerbooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface   NYTServices {

    @GET("lists.json")

    fun getBooks(
        @Query("api-key") apikey: String = "cDAzwFjyw40r7Dcvw4S1ukHIwUK8MizR",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>

}