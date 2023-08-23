package com.example.udemylearnkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Arrays

fun isOldEnough(age: Int): Boolean {
    return age >= 5
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ages = arrayOf(4, 8, 20)
        val names = Array(5){""}
        names[0] = "Boby"
        val array = Array(10) {0}
        val age: Int = 10
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
            println("$name a $age ans.")
            println(typeHuman)
        }

        val number : Array<String> = arrayOf("un", "deux", "trois", "quatre", "cinq")
        for ((index, numbers) in number.withIndex()){
            if (numbers != "quatre"){
                println("$numbers est à lindex $index")
                continue
                println("8")
            }

        }

        println(array.contentToString())
        println(names.contentToString())
    }
}