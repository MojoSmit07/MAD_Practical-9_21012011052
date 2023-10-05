package com.example.mad_practical_9_21012011052

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    lateinit var logoanimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logo1: ImageView = findViewById(R.id.logo1)

        logo1.setBackgroundResource(R.drawable.guni_logo_animation)
        logoanimation = logo1.background as AnimationDrawable;

        val myAnimation = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        logo1.startAnimation(myAnimation)

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoanimation.start()
        } else {
            logoanimation.stop()
        }
    }
}