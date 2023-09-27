package com.example.project2611

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //intent explicit

        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.EditTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextTextPassword)
        val logModel = LoginModel()

        //event btn login
        btnLogin.setOnClickListener{
            //input
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //validate
            if(logModel.loginCheck() == true) {
                //call home activity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this, "Login gagal, cek username dan password",Toast.LENGTH_SHORT).show()

            }

        }
    }
}