package com.example.examapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.R
import com.example.examapp.adapters.CategoriyAdapter
import com.example.examapp.adapters.RestourantsAdapter
import com.example.examapp.models.Category
import com.example.examapp.models.Restourants

class HomeFragment: Fragment() {
    private lateinit var recyclerView_gor: RecyclerView
    private lateinit var recyclerView_ver: RecyclerView

    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        initViews()

        return root
    }

    private fun initViews() {
        recyclerView_gor = root.findViewById(R.id.recyclerView_gor)
        recyclerView_ver = root.findViewById(R.id.recyclerView_ver)

        recyclerView_gor.layoutManager = LinearLayoutManager(root.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView_ver.layoutManager = GridLayoutManager(root.context, 2)
        refreshCategoryAdapter(getAllCategory())
        refreshRestaourantAdapter(getAllRestaurant())
    }

    private fun refreshRestaourantAdapter(items: ArrayList<Restourants>) {
        val adapter = RestourantsAdapter(this, items)
        recyclerView_ver.adapter = adapter
    }

    private fun getAllRestaurant(): ArrayList<Restourants> {
        var items = ArrayList<Restourants>()
        items.add(Restourants(R.drawable.img_1, "Gamine"))
        items.add(Restourants(R.drawable.img_2, "Doppio Zero"))
        items.add(Restourants(R.drawable.img_8, "Lupa Trattoria"))
        items.add(Restourants(R.drawable.img_9, "BlackWood"))
        items.add(Restourants(R.drawable.img_1, "Gamine"))
        items.add(Restourants(R.drawable.img_2, "Doppio Zero"))
        items.add(Restourants(R.drawable.img_8, "Lupa Trattoria"))
        items.add(Restourants(R.drawable.img_9, "BlackWood"))
        items.add(Restourants(R.drawable.img_1, "Gamine"))
        items.add(Restourants(R.drawable.img_2, "Doppio Zero"))
        items.add(Restourants(R.drawable.img_8, "Lupa Trattoria"))
        items.add(Restourants(R.drawable.img_9, "BlackWood"))
        items.add(Restourants(R.drawable.img_1, "Gamine"))
        items.add(Restourants(R.drawable.img_2, "Doppio Zero"))
        items.add(Restourants(R.drawable.img_8, "Lupa Trattoria"))
        items.add(Restourants(R.drawable.img_9, "BlackWood"))

        return items
    }

    private fun refreshCategoryAdapter(items: ArrayList<Category>) {
        var adapter = CategoriyAdapter(this, items)
        recyclerView_gor.adapter = adapter
    }

    private fun getAllCategory(): ArrayList<Category> {
        var categories = ArrayList<Category>()
        categories.add(Category(R.drawable.img_1, "Restaurants"))
        categories.add(Category(R.drawable.img_14, "Cofee Shops"))
        categories.add(Category(R.drawable.img_15, "Shoping"))
        categories.add(Category(R.drawable.img_16, "Sports shop"))
        categories.add(Category(R.drawable.img_1, "Restaurants"))
        categories.add(Category(R.drawable.img_14, "Cofee Shops"))
        categories.add(Category(R.drawable.img_15, "Shoping"))
        categories.add(Category(R.drawable.img_16, "Sports shop"))
        categories.add(Category(R.drawable.img_1, "Restaurants"))
        categories.add(Category(R.drawable.img_14, "Cofee Shops"))
        categories.add(Category(R.drawable.img_15, "Shoping"))
        categories.add(Category(R.drawable.img_16, "Sports shop"))
        categories.add(Category(R.drawable.img_1, "Restaurants"))
        categories.add(Category(R.drawable.img_14, "Cofee Shops"))
        categories.add(Category(R.drawable.img_15, "Shoping"))
        categories.add(Category(R.drawable.img_16, "Sports shop"))

        return categories
    }
}