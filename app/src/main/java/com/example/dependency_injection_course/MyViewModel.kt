package com.example.dependency_injection_course

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MyViewModel @Inject constructor(
    viewModelLOg: String
) : ViewModel() {
}