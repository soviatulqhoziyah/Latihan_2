package com.soviatul.latihan_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.username_input)
        passwordEditText = findViewById(R.id.password_input)
        loginButton = findViewById(R.id.login_btn)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "admin" && password == "123456") {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
                startActivity(intent)

            } else {
                Toast.makeText(
                    this,
                    "username atau password salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }}