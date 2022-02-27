package com.example.examapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.adapters.SearchAdapter
import com.example.examapp.models.Search

class SearchFragment : Fragment() {
    lateinit var root: View
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_search, container, false)

        initViews()

        return root
    }

    private fun initViews() {
        recyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(root.context, 1)

        refreshAdapter(gettAllSearch())
    }

    private fun refreshAdapter(items: ArrayList<Search>) {
        var adapter = SearchAdapter(root.context, items)
        recyclerView.adapter = adapter
    }

    private fun gettAllSearch(): ArrayList<Search> {
        var items = ArrayList<Search>()
        items.add(Search( R.drawable.img,"Valloy Taved"))
        items.add(Search( R.drawable.img_12,"Valloy Taved"))
        items.add(Search( R.drawable.img_11,"Valloy Taved"))
        items.add(Search( R.drawable.img_10,"Valloy Taved"))
        items.add(Search( R.drawable.img_9,"Valloy Taved"))
        items.add(Search( R.drawable.img_14,"Valloy Taved"))
        items.add(Search( R.drawable.img_13,"Valloy Taved"))
        items.add(Search( R.drawable.img,"Valloy Taved"))
        items.add(Search( R.drawable.img_12,"Valloy Taved"))
        items.add(Search( R.drawable.img_11,"Valloy Taved"))
        items.add(Search( R.drawable.img_10,"Valloy Taved"))
        items.add(Search( R.drawable.img_9,"Valloy Taved"))
        items.add(Search( R.drawable.img_14,"Valloy Taved"))
        items.add(Search( R.drawable.img_13,"Valloy Taved"))

        return items
    }
}