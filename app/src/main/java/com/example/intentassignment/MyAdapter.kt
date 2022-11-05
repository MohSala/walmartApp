package com.example.intentassignment

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val onClickListener: OnClickListener, var productList: ArrayList<Product>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productList[position]
        holder.titleImage.setImageResource(currentItem.image)
        holder.productHeading.text = currentItem.title
        holder.productPrice.text = currentItem.price.toString()
        holder.productColor.text = currentItem.color

        holder.itemView.setOnClickListener {
            onClickListener.onClick(currentItem)
        }

    }
    override fun getItemCount(): Int {
        return productList.size;
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val productHeading: TextView = itemView.findViewById(R.id.productHeading)
        val productPrice: TextView = itemView.findViewById(R.id.productPrice)
        val productColor: TextView = itemView.findViewById(R.id.productColor)

    }

    class OnClickListener(val clickListener: (product: Product) -> Unit) {
        fun onClick(product: Product) = clickListener(product)
    }

}