package com.example.productsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsRecycleAdapter (val context: Context, val products : List<Produkt>) :
    RecyclerView.Adapter<ProductsRecycleAdapter.ViewHolder>() {

    var layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_shop, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produkt = products[position]

        holder.nameTextView.text = produkt.name
        holder.priceTectView.text = produkt.price.toString()
        holder.imageView.setImageResource(produkt.image)
    }

    override fun getItemCount() = products.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        var priceTectView = itemView.findViewById<TextView>(R.id.priceTextView)
        var imageView = itemView.findViewById<ImageView>(R.id.imageView)
    }
}