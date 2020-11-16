package com.example.pricey

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.progressBar
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        progressBar.max = 10
        progressBar.isActivated = true
        val currentprogress = 10
        ObjectAnimator.ofInt(progressBar,"progress",currentprogress)
            .setDuration(900)
            .start()
        productbutton.setOnClickListener {
            intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }





    }
}