package com.google.dancs3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.dancs3_1.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val coffeeID = intent.getIntExtra(COFFE_ID_EXTRA,-1)
        val coffee = coffeeFromID(coffeeID)
        if(coffee != null){
            binding.cover.setImageResource(coffee.img)
            binding.title.text = coffee.tvnName
            binding.gia.text =coffee.tvgia
        }

    }

    private fun coffeeFromID(coffeeID: Int): coffee? {
        for (coffee in coffeeList) {
            if (coffee.id == coffeeID)
                return coffee;


        }
        return null
    }
}