package com.example.dependency_injection_course.repositries

import com.example.dependency_injection_course.api.ApiRetrofit
import com.example.dependency_injection_course.models.User
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class Repository  {

    suspend fun getAllUsers(): Response<List<User>> {
        return ApiRetrofit.api.getAllUsers()
    }

}