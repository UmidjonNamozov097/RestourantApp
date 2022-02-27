package com.example.examapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.models.Search

class SearchAdapter(var context: Context, var items: ArrayList<Search>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false)
        return SearchViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is SearchViewHolder){

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class SearchViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}