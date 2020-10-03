package com.example.core

import android.app.Application
import android.content.Context

/**
 *
 *  author : Jiyf
 *  e-mail : ffaa30703@icloud.com
 *  time   : 2020/10/03
 *  desc   :
 *  version: 1.0
 *
 */
class BaseApplication : Application() {
    companion object {

        private lateinit var currentApplication: Context

        fun currentApplication(): Context {
            return currentApplication
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        currentApplication = this
    }
}