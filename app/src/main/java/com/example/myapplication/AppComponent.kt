package com.example.myapplication

import com.example.myapplication.module.DatabaseModule
import com.example.myapplication.module.NetworkModule
import dagger.Component


@Component(modules = [DatabaseModule::class, NetworkModule::class])
interface AppComponent {
    fun getDatabaseHelper() : DatabaseHelper
    fun getNetworkUtils(): NetworkUtils

    fun injectToMainActivity(mainActivity: MainActivity)
}