package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import secondActivity.seconddActivity
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,seconddActivity::class.java)
            val editText1 = findViewById<EditText>(R.id.editext1)
            val editText2 = findViewById<EditText>(R.id.editext2)
            val text2 = editText2.text.toString()
            val text1 = editText1.text.toString()
            if(text1.isEmpty() || text2.isEmpty()){
                val text = "Введите пароль"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }else {
                if (text1 == text2) {
                    startActivity(intent)
                } else {
                    val text = "Пароли не совпадают"
                    val duration =
                        Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()

                }
            }

        }

    }
}

