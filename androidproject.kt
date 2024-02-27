package com.example.kotlinbasics.androidca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class spalshScreen : AppCompatActivity() {
    private val splashTime: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
        },splashTime)
    }
}