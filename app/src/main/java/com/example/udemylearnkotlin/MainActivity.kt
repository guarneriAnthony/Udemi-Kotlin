package com.example.udemylearnkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 10
        val name: String = "Bob"
        val height: Float = 1.60F
        val type = if (age < 18) "est un enfant" else " est un adulte"

        var typeHuman = when (age) {
            in 1..5 -> "cest un bb"
            in 6..18 -> "cest un ados"
            !in 18..40 -> "n'est plus jeune"
            else -> "condition non gere"
        }

        if (age > 0 && name === "Bob") {
            println("$name" + " a " +age + " ans.")
            println("$typeHuman")
        }
    }
}