package com.example.examapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.models.Message

class MessageAdapter(var context: Context, var items: ArrayList<Message>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is MessageViewHolder){
            var iv_image = holder.iv_image
            var tv_name = holder.tv_name
            var tv_message = holder.tv_message

            iv_image.setImageResource(item.iv_image)
            tv_name.text = item.tv_name
            tv_message.text = item.tv_message
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image: ImageView
        var tv_name: TextView
        var tv_message: TextView

        init {
            iv_image = view.findViewById(R.id.iv_image)
            tv_name = view.findViewById(R.id.tv_name)
            tv_message = view.findViewById(R.id.tv_message)
        }
    }
}