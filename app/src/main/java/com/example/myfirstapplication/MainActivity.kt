package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val but : Button = findViewById(R.id.cli)
        but.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity2::class.java
                )
            )
            finish()
        })
    }
}


