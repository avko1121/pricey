package com.example.pricey

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.fragment_card.*
import kotlinx.android.synthetic.main.fragment_cash.*

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)


        progressBar.max = 100
        progressBar.isActivated = true
        val currentprogress2= 100
        ObjectAnimator.ofInt(progressBar,"progress",currentprogress2)
            .setDuration(6000)
            .start()

    }
}