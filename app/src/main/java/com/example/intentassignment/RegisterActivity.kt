package com.example.intentassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun register(view: View) {
        val fn : EditText = findViewById<EditText>(R.id.firstName)
        val ln : EditText = findViewById<EditText>(R.id.lastName)
        val email : EditText = findViewById<EditText>(R.id.email)
        val pwd : EditText = findViewById<EditText>(R.id.password)
        if(fn != null && ln != null && email !=null && pwd != null) {
            Toast.makeText(this, "Account created successfully", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("fn", fn.text.toString())
            intent.putExtra("ln", ln.text.toString())
            intent.putExtra("email", email.text.toString())
            intent.putExtra("pwd", pwd.text.toString())
            startActivity(intent)
        }
    }
}