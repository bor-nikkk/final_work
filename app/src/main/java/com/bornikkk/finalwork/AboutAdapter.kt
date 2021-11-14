package com.bornikkk.finalwork

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AboutAdapter(private val aboutNameList: List<String>) :
    RecyclerView.Adapter<AboutViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutViewHolder {

        val aboutItemView = LayoutInflater.from(parent.context).inflate(R.layout.aboub_list_item, parent, false)


        return AboutViewHolder(aboutItemView)
    }

    override fun onBindViewHolder(holder: AboutViewHolder, position: Int) {
        val aboutName = aboutNameList[position]
        holder.bind(aboutName)
    }

    override fun getItemCount(): Int {
        return aboutNameList.size
    }
}