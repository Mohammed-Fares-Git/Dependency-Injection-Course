package com.example.dependency_injection_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.EntryPoint
import javax.inject.Inject

private const val HILT_COURSE = "Hilt-Course"
@EntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d(HILT_COURSE, name)




    }
}