package com.example.playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.R
import com.example.playmarket.utils.Data
import kotlinx.android.synthetic.main.item.view.*


class RvAdapter(var list: ArrayList<Data>) : RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun BindData(data: Data) {
            itemView.title.text = data.title
            itemView.right_arrow.setImageResource(data.icon!!)
            var inner_adapter = Inner_Adapter(data.apps!!)
            itemView.inner_rv.adapter = inner_adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        var data: Data = list[position]
        holder.BindData(data)
    }

    override fun getItemCount(): Int = list.size
}