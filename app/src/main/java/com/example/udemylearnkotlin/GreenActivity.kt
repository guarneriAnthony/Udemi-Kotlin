package com.example.udemylearnkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreenActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val user = intent.getParcelableExtra<User>("user")
        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)

        nameTextView.text = "Nom de l'user: ${user?.name}"
        ageTextView.text = "Age de l'user: ${user?.age}"
    }
}