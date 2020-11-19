package com.example.pricey

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.progressBar
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        progressBar.max = 100
        val currentprogress = 70
        ObjectAnimator.ofInt(progressBar,"progress",currentprogress)
            .setDuration(1200)
            .start()


        sportbutton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }



    }
}