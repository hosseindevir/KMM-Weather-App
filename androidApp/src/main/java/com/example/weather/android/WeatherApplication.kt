package com.example.weather.android

import android.app.Application
import com.example.weather.initializeNapier

class WeatherApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initializeNapier()
    }
}