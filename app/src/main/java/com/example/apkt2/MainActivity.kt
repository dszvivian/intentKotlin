package com.example.apkt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apkt2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnMain.setOnClickListener {
            val text = binding.mEtText.text.toString()
            val intentMain = Intent(this,getdataActivity::class.java)
            intentMain.putExtra("text",text)
            startActivity(intentMain)
        }
    }
}