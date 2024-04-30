package com.example.myapplication.module

import com.example.myapplication.NetworkUtils
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun providesNetworkUtils() : NetworkUtils {
        return NetworkUtils()
    }
}