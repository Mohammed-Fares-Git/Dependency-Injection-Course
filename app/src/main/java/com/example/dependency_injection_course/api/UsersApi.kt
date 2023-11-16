package com.example.dependency_injection_course.api

import com.example.dependency_injection_course.models.User
import retrofit2.Response
import retrofit2.http.GET

interface UsersApi {
    @GET("/users")
    suspend fun getAllUsers(): Response<List<User>>
}

