package com.example.youtubeproject

import android.app.Application
import com.example.youtubeproject.repository.Repository

class App: Application() {

    companion object{
        val repository:Repository by lazy { Repository() }
    }
}