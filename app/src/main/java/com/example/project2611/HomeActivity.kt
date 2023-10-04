package com.example.project2611

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //INSTANCE
        val btnBookKid: Button = findViewById(R.id.buttonBookKid)

        //event button fable
        btnBookKid.setOnClickListener {



        }

    }
}