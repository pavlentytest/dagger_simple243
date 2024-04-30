package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var networkUtils: NetworkUtils
    @Inject
    lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //val comp = (application as App).appComponent
       // Log.d("RRR",comp.getNetworkUtils().toString())
        //Log.d("RRR",comp.getDatabaseHelper().toString())
        (application as App).appComponent.injectToMainActivity(this)
        Log.d("RRR",networkUtils.toString())
        Log.d("RRR",databaseHelper.toString())

    }
}