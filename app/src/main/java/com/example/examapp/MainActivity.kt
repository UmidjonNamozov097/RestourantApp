package com.example.examapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.examapp.adapters.ViewPagerAdapter
import com.example.examapp.fragment.CollectionFragment
import com.example.examapp.fragment.HomeFragment
import com.example.examapp.fragment.MessagesFragment
import com.example.examapp.fragment.SearchFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPagerAdapter = ViewPagerAdapter(getSupportFragmentManager())

        viewPagerAdapter.add(HomeFragment())
        viewPagerAdapter.add(CollectionFragment())
        viewPagerAdapter.add(MessagesFragment())
        viewPagerAdapter.add(SearchFragment())

        viewPager.adapter = viewPagerAdapter

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(viewPager))
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }
}