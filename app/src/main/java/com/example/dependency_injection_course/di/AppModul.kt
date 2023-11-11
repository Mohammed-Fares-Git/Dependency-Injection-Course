package com.example.dependency_injection_course.di

import android.content.Context
import com.example.dependency_injection_course.R
import com.example.dependency_injection_course.ulils.Constantes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModul {

    @Singleton
    @Provides
    @Named(Constantes.FIRSTNAME_HILTNAMED)
    fun provideFirstName (@ApplicationContext ctx: Context): String {
        return ctx.getString(R.string.firstName)
    }

    @Singleton
    @Provides
    @Named(Constantes.LASTNAME_HILTNAMED)
    fun provideLastName (@ApplicationContext ctx: Context): String {
        return ctx.getString(R.string.lastName)
    }

}