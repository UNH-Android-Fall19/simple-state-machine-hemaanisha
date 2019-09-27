package com.example.listview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(val ctx: Context, val data:MutableList<MainModel>): RecyclerView.Adapter<NameAdapter.ItemViewHolder>() {

    //You set which design to repeat in a list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(ctx).inflate(R.layout.item_main, parent, false))
    }

    //You bind data from your list to design
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val maindata = data[position]
        holder.item_name.text = maindata.name
        holder.item_price.text = maindata.price
    }

    override fun getItemCount() = data.size

    class ItemViewHolder(val v: View) : RecyclerView.ViewHolder(v){
        var item_name: TextView
        var item_price: TextView

        init {
            item_name = v.findViewById(R.id.item_name)
            item_price = v.findViewById(R.id.item_price)
        }
    }
}