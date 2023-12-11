package com.example.uas.retrofit

import retrofit2.http.GET

interface ApiService {
    @GET("users/{id}")
    fun getUser(): `fun`??: Call<User>
}