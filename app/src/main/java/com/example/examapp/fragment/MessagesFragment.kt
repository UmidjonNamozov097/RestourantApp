package com.example.examapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.adapters.MessageAdapter
import com.example.examapp.models.Message

class MessagesFragment: Fragment() {
    lateinit var root: View
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_message, container, false)

        initVioews()

        return root
    }

    private fun initVioews() {
        recyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(root.context, 1)

        refreshAdapter(getAllMessage())
    }

    private fun refreshAdapter(items: ArrayList<Message>) {
        var adapter = MessageAdapter(root.context, items)
        recyclerView.adapter = adapter
    }

    private fun getAllMessage(): ArrayList<Message> {
        var items = ArrayList<Message>()

        items.add(Message(R.drawable.img_10, "Marina", "This looks like a great dear !"))
        items.add(Message(R.drawable.img, "Mareo", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_11, "Jeff", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_12, "Antoine", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_13, "Craing", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_10, "Marina", "This looks like a great dear !"))
        items.add(Message(R.drawable.img, "Mareo", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_11, "Jeff", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_12, "Antoine", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_13, "Craing", "This looks like a great dear !"))
        items.add(Message(R.drawable.img_10, "Marina", "This looks like a great dear !"))
        items.add(Message(R.drawable.img, "Mareo", "This looks like a great dear !"))
        return items
    }
}