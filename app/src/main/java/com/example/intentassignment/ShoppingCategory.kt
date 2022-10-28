package com.example.intentassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class ShoppingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)
        val intent = getIntent()
        val output = intent.getStringExtra("emailAddress")
        val rm: TextView = findViewById<TextView>(R.id.returnMessage)
        rm.text = output
    }

    fun clickElectronics(view: View) {

        Toast.makeText(this, "You have chosen the ${findViewById<TextView>(R.id.electronics).text} category of shopping", Toast.LENGTH_LONG).show()

    }

    fun clickClothes(view: View) {

        Toast.makeText(this, "You have chosen the ${findViewById<TextView>(R.id.cloth).text} category of shopping", Toast.LENGTH_LONG).show()

    }
}