package com.kotlin.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_homepage)
        val name = findViewById<TextView>(R.id.nameforUser)
        val username = intent.getStringExtra("msg")
        name.text=username
    }
}