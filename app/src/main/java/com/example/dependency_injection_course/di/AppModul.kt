package com.example.dependency_injection_course.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModul {

    @Singleton
    @Provides
    fun provideFirstName (): String {
        return "Mohammed"
    }

    @Singleton
    @Provides
    fun provideLastName (): String {
        return "Fares"
    }

}