package com.example.clima

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity

class Network {
    companion object{
        fun hayRed(activity: AppCompatActivity):Boolean{
            val connectivyManager = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connectivyManager.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }
}