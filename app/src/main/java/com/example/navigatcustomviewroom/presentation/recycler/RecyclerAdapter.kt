package com.example.navigatcustomviewroom.presentation.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigatcustomviewroom.domain.DataN
import com.example.navigatcustomviewroom.domain.News
import com.example.navigatcustomviewroom.domain.load

class RecyclerAdapter : RecyclerView.Adapter<RecyclerHolder>() {

    private var items:List<News> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerHolder {
        return RecyclerHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        holder.bindView(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(data: DataN) {
        items = data.data
        notifyDataSetChanged()
    }
}