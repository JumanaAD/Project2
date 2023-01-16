package com.kotlin.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        supportActionBar?.hide()
        val car = findViewById<ImageView>(R.id.car)
        car.setOnLongClickListener() {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
            true
        }

    }
}

