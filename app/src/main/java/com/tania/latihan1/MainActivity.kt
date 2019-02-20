package com.tania.latihan1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tania.latihan1.Utils.Companion.placeModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvItemPlace.adapter = PlaceAdapter(placeModels)
    }

}

