package com.example.intentassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val user1: User = User("First","Last", "first@gmail.com", "123456")
    val user2: User = User("Second","Last", "sec@gmail.com", "123456")
    val user3: User = User("Third","Last", "third@gmail.com", "123456")
    val user4: User = User("Forth","Last", "forth@gmail.com", "123456")
    val user5: User = User("Fifth","Last", "fifth@gmail.com", "123456")

    var users : Array<User> = arrayOf(user1,user2,user3,user4,user5)

    fun signIn(view: View) {
        val email : EditText = findViewById(R.id.email)
        val password : EditText = findViewById(R.id.password)
        for(u in users) {
            if(u.username == email.text.toString()  && u.password == password.text.toString()) {
                login(email.text.toString())
            }
        }
    }

    fun createAcct(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun login(email: String) {
        val intent = Intent(this, ShoppingCategory::class.java)
        intent.putExtra("emailAddress", email)
        startActivity(intent)
    }
}