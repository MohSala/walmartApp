package com.example.intentassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val intent = getIntent()
        val pt = intent.getStringExtra("productTitle")
        val pc = intent.getStringExtra("productColor")
        val pd = intent.getStringExtra("productDescription")
        val productTitle : TextView = findViewById(R.id.detailTitle)
        val productColor : TextView = findViewById(R.id.detailColor)
        val productDesc : TextView = findViewById(R.id.detailDescription)
        productTitle.text = pt
        productColor.text = pc
        productDesc.text = pd


    }
}