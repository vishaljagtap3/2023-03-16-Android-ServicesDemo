package com.bitcodetech.servicesdemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        mt("OnCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mt("onStartCommand ${startId}")
        mt("song: ${intent!!.getStringExtra("path")}")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        mt("onDestroy")
        super.onDestroy()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null

    }

    private fun mt(text : String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}