package com.example.weather

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

fun initializeNapier() {
    Napier.base(DebugAntilog())
}

fun doSomething() {
    Napier.v("Verbose", tag = "Tag Verbose")
    Napier.d("Debug", tag = "Tag Debug")
    Napier.i("Info", tag = "Tag Info")
    Napier.w("Warning", tag = "Tag Warning")
    Napier.e("Error", tag = "Tag Error")
}