package com.example.pricey

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.progressBar

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            textView3.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

            progressBar.max = 10
            val currentprogress = 4
            ObjectAnimator.ofInt(progressBar,"progress",currentprogress)
                .setDuration(900)
                .start()



            button3.setOnClickListener {
                if(textView3.text.isNotEmpty()){
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
                }
            }




    }




    }

