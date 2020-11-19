package com.example.pricey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.password
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
       buttonreg.setOnClickListener {
            if (name.text.toString().isNotEmpty() && username.text.toString().isNotEmpty() && age.text.toString().isNotEmpty() && address.text.toString().isNotEmpty() && mail.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                setContentView(R.layout.activity_main2)
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)}
        }

    }
}
