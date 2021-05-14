package com.iameben.zuriviewgroups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
    }

    // initialization for the Ui components and onClickListener
    private fun init(){
        val click = findViewById<Button>(R.id.login_bt)
        val email = findViewById<EditText>(R.id.email_et)
        val password = findViewById<EditText>(R.id.password_et)

        click?.setOnClickListener{
            // converts edittext input to string and compares with expected
            validate(email.text.toString(), password.text.toString())
        }
    }

    //  function to validate the user's input
    private fun validate(userName: String, userPassword: String) {
        if(userName == "test@test.com" && userPassword == "test"){
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(applicationContext, R.string.toast_msg,Toast.LENGTH_SHORT).show()
            startActivity(intent)
            finish()
        }

    }
}