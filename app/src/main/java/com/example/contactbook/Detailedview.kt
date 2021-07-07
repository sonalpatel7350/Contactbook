package com.example.contactbook

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Detailedview :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedview)

        val tvName:TextView = findViewById(R.id.tvdName)
        val tvMobile : TextView = findViewById(R.id.tvdMobile)

        tvName.text=intent.getStringExtra("user_name")
        tvMobile.text=intent.getStringExtra("mobile_number")
    }
}