package com.example.weather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform