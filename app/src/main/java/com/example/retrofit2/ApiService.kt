package com.example.retrofit2

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getDogByName(@Url url:String): Response<DogResponse>
}