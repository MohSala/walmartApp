package com.example.intentassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var newRecylerView : RecyclerView
    private lateinit var newArrayList : ArrayList<Product>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageId = arrayOf(
            R.drawable.tv,
            R.drawable.tv,
            R.drawable.tv,
            R.drawable.tv,
            R.drawable.tv,
        )

        heading = arrayOf(
            "GforceTXA",
            "Sony LED TV",
            "LG G5 Phone",
            "Iphone 8 Max",
            "IPAD Pro 5"
        )
        newRecylerView = findViewById(R.id.recyclerview)
        newRecylerView.layoutManager = LinearLayoutManager(this)
        newRecylerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Product>()
        getProductData()
    }

    fun getProductData() {
        for (i in imageId.indices) {
            val product = Product(heading[i],8000.00,"Black",imageId[i], "GeneratorX","Description of the product")
            newArrayList.add(product)
        }
        newRecylerView.adapter = MyAdapter(MyAdapter.OnClickListener {
            product ->
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra("productTitle", product.title)
            intent.putExtra("productColor", product.color)
            intent.putExtra("productDescription", product.desc)
            startActivity(intent)
        } ,newArrayList)
    }
}