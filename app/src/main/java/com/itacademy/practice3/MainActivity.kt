package com.itacademy.practice3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var imageView: ImageView
    lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.edittext)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.images1)
        imageView = findViewById(R.id.images2)
        imageView = findViewById(R.id.images3)


        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            when{
                editText.text.toString() == "1" -> {
                    intent.putExtra("IMAGESS", R.drawable.images1)
                    startActivity(intent)
                }
                editText.text.toString() == "2" -> {
                    intent.putExtra("IMAGESS", R.drawable.images2)
                    startActivity(intent)
                }
                editText.text.toString() == "3" -> {
                    intent.putExtra("IMAGESS", R.drawable.images3)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this,"ERROR", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

