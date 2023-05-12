package com.ZenSpace.aviothic

import android.content.Intent
import android.graphics.drawable.PictureDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.os.Handler
import com.caverock.androidsvg.SVG

class SplashScreen : AppCompatActivity() {

    lateinit var logoIv: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        logoIv = findViewById(R.id.logo)


        Handler().postDelayed({
            // Start the main activity after the splash screen is done
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 3000)

    }
}