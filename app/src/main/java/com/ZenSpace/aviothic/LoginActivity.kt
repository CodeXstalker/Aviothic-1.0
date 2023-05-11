package com.ZenSpace.aviothic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class LoginActivity : AppCompatActivity() {
    lateinit var relative :RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
}