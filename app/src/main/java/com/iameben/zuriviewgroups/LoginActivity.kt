package com.iameben.zuriviewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    val login_button = findViewById<Button>(R.id.login_bt)
    val email_tx = findViewById<EditText>(R.id.email_et)
    val password_tx = findViewById<EditText>(R.id.password_et)



}