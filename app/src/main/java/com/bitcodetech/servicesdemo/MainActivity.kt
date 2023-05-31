package com.bitcodetech.servicesdemo

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.bitcodetech.servicesdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartService.setOnClickListener {
            val intent = Intent(this@MainActivity, MyService::class.java )
            intent.putExtra("path", binding.edtPath.text.toString())
            startService(intent)
            //startForegroundService(intent)
        }

        binding.btnStopService.setOnClickListener {
            val intent = Intent(this@MainActivity, MyService::class.java )
            stopService(intent)
        }

    }
}