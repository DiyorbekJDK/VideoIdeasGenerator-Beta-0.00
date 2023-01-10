package com.diyorbek.videoideasgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        findViewById<LinearLayout>(R.id.ideaForVideoGame).setOnClickListener {
            startActivity(Intent(this,IdeaGenerator::class.java))
            finish()
        }

    }
    private fun onClick(){

    }
}