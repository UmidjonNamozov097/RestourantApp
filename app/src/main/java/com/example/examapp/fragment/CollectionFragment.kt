package com.example.examapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.adapters.CollectionAdapter
import com.example.examapp.models.Collection

class CollectionFragment : Fragment() {
    lateinit var root: View
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_collection, container, false)
        initViews()
        return root
    }

    private fun initViews() {
        recyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(root.context, 1)

        refreshAdapter(getAllCollection())
    }

    private fun refreshAdapter(items: ArrayList<Collection>) {
        var adapter = CollectionAdapter(root.context, items)
        recyclerView.adapter = adapter
    }

    private fun getAllCollection(): ArrayList<Collection> {
        var items = ArrayList<Collection>()

        items.add(Collection(R.drawable.img_1, "Hotels"))
        items.add(Collection(R.drawable.img_2, "Restourants"))
        items.add(Collection(R.drawable.img_4, "Cars"))
        items.add(Collection(R.drawable.img_5, "Jobs"))
        items.add(Collection(R.drawable.img_6, "Furniture"))
        items.add(Collection(R.drawable.img_7, "Phone"))
        items.add(Collection(R.drawable.img_1, "Hotels"))
        items.add(Collection(R.drawable.img_2, "Restourants"))
        items.add(Collection(R.drawable.img_4, "Cars"))
        items.add(Collection(R.drawable.img_5, "Jobs"))
        items.add(Collection(R.drawable.img_6, "Furniture"))
        items.add(Collection(R.drawable.img_7, "Phone"))
        items.add(Collection(R.drawable.img_1, "Hotels"))
        items.add(Collection(R.drawable.img_2, "Restourants"))
        items.add(Collection(R.drawable.img_4, "Cars"))
        items.add(Collection(R.drawable.img_5, "Jobs"))
        items.add(Collection(R.drawable.img_6, "Furniture"))
        items.add(Collection(R.drawable.img_7, "Phone"))

        return items
    }

}