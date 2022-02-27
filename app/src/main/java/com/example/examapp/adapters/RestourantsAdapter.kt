package com.example.examapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.fragment.HomeFragment
import com.example.examapp.models.Restourants

class RestourantsAdapter(var context: HomeFragment, var items: ArrayList<Restourants>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_ver, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is RestaurantViewHolder){
            var iv_image = holder.iv_image
            var tv_name = holder.tv_name

            iv_image.setImageResource(item.iv_image)
            tv_name.text = item.tv_name
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image: ImageView
        var tv_name: TextView

        init {
            iv_image = view.findViewById(R.id.iv_image)
            tv_name = view.findViewById(R.id.tv_name)
        }
    }
}