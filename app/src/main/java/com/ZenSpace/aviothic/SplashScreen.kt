package com.ZenSpace.aviothic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.os.Handler
class SplashScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            // Start the main activity after the splash screen is done
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2800)

    }
}