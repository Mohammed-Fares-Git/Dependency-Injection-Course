package com.example.dependency_injection_course.di

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelModul::class)
class ViewModelModul {

    @ViewModelScoped
    @Provides
    fun provideLog(): String {
        return "view model log"
    }
}