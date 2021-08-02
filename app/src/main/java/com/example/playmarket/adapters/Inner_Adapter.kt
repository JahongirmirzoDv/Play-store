package com.example.playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.R
import com.example.playmarket.utils.Apps
import kotlinx.android.synthetic.main.inner_item.view.*

class Inner_Adapter(var list: ArrayList<Apps>) : RecyclerView.Adapter<Inner_Adapter.Vh>() {
    inner class Vh(itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun OnBind(apps: Apps) {
            itemView.image.setImageResource(apps.img!!)
            itemView.desc.text = apps.name
            itemView.size.text = apps.size
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.inner_item, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        var apps: Apps = list[position]
        holder.OnBind(apps)
    }

    override fun getItemCount(): Int = list.size
}