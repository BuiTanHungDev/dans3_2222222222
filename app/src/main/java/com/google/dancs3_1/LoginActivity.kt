package com.google.dancs3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.dancs3_1.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}