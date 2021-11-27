package com.itacademy.practice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView


class MainActivity2 : AppCompatActivity() {

    lateinit var imageButton: ImageButton
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageView = findViewById(R.id.imagesview)
        imageButton = findViewById(R.id.btnback)

        val image = intent.getIntExtra("IMAGESS", 0)
        imageView.setImageResource(image)

        imageButton.setOnClickListener {
            onBackPressed()
        }
    }
}