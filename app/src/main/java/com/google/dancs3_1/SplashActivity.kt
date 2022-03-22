package com.google.dancs3_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.dancs3_1.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private var time:Long =3000
    private fun loadSplashScreen() {
        Handler().postDelayed(
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, time
        )
    }

    
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
      binding = ActivitySplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        loadSplashScreen()



//          binding.bg.alpha = 0F
//        binding.bg.animate().setDuration(100).alpha(1f).withEndAction{
//             val intent = Intent(this@SplashActivity, MainActivity::class.java)
//            startActivity(intent)
//
//            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//            finish()
//        }


    }
}