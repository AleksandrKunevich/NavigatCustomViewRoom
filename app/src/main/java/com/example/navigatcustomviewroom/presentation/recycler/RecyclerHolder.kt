package com.example.navigatcustomviewroom.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigatcustomviewroom.R
import com.example.navigatcustomviewroom.domain.News

class RecyclerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun from(parent: ViewGroup): RecyclerHolder {
            return RecyclerHolder(
                LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.news_recycler_element, parent, false)
            )
        }
    }

    private val titleItem: TextView = itemView.findViewById(R.id.textViewTitle)
    private val authorItem: TextView = itemView.findViewById(R.id.textViewAuthor)
    private val dateItem: TextView = itemView.findViewById(R.id.textViewDate)

    fun bindView(item: News) {
        titleItem.text = item.title
        authorItem.text = item.author
        dateItem.text = item.date
    }
}