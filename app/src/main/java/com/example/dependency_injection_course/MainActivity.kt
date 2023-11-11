package com.example.dependency_injection_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dependency_injection_course.ulils.Constantes
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

private const val HILT_COURSE = "Hilt-Course"
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named(Constantes.FIRSTNAME_HILTNAMED) lateinit var firstName: String
    @Inject
    @Named(Constantes.LASTNAME_HILTNAMED) lateinit var lastName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(HILT_COURSE, "Hi, Mr.$firstName $lastName")

    }
}