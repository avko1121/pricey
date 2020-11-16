package com.example.pricey

import adaptors.viewpageradaptor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fragments.CardFragment
import fragments.CashFragment
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.fragment_card.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        setuptabs()







        }
    private fun setuptabs(){
        val adapter = viewpageradaptor(supportFragmentManager)
        adapter.addfragment(CardFragment(), "საკრედიტო ბარათი")
        adapter.addfragment(CashFragment(), "ნაღდი ანგარიშსწორება")
        viewpager.adapter = adapter
        tabs.setupWithViewPager(viewpager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_credit_card_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_attach_money_24)


    }


}