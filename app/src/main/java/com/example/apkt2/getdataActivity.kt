package com.example.apkt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apkt2.databinding.ActivityGetdataBinding

class getdataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGetdataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getStringExtra("text")
        binding.gdTvData.text = data


    }
}