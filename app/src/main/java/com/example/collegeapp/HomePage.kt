package com.example.collegeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomePage : AppCompatActivity() {

    private lateinit var chatbtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        chatbtn = findViewById(R.id.imageButton)

        chatbtn.setOnClickListener {
            val intent = Intent(this, chat::class.java)
            startActivity(intent)
            }
        }
}