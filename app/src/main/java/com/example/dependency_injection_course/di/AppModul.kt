package com.example.dependency_injection_course.di

import com.example.dependency_injection_course.ulils.Constantes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModul {

    @Singleton
    @Provides
    @Named(Constantes.FIRSTNAME_HILTNAMED)
    fun provideFirstName (): String {
        return "Mohammed"
    }

    @Singleton
    @Provides
    @Named(Constantes.LASTNAME_HILTNAMED)
    fun provideLastName (): String {
        return "Fares"
    }

}