package com.example.examapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.example.examapp.adapters.ViewPagerAdapter
import com.example.examapp.fragment.SplashFragment1
import com.example.examapp.fragment.SplashFragment2
import com.example.examapp.fragment.SplashFragment3
import com.example.examapp.fragment.SplashFragment4
import com.google.android.material.tabs.TabLayout

class SplashActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var tableLayout: TabLayout
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var btn_skip: Button
    private lateinit var btn_next: Button
    private lateinit var btn_done: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        initViews()

        btn_done.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewPager)
        tableLayout = findViewById(R.id.tab_layout)
        btn_skip = findViewById(R.id.btn_skip)
        btn_next = findViewById(R.id.btn_next)
        btn_done = findViewById(R.id.btn_done)

        viewPagerAdapter = ViewPagerAdapter(getSupportFragmentManager())

        viewPagerAdapter.add(SplashFragment1())
        viewPagerAdapter.add(SplashFragment2())
        viewPagerAdapter.add(SplashFragment3())
        viewPagerAdapter.add(SplashFragment4())

        viewPager.adapter = viewPagerAdapter

        tableLayout.setupWithViewPager(viewPager)

        btn_skip.setOnClickListener(View.OnClickListener {
            viewPager.currentItem = 4
        })

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                if (position != 3){
                    btn_skip.visibility = ViewPager.VISIBLE
                    btn_next.visibility = ViewPager.VISIBLE
                    btn_done.visibility = ViewPager.GONE
                } else {
                    btn_skip.visibility = ViewPager.GONE
                    btn_next.visibility = ViewPager.GONE
                    btn_done.visibility = ViewPager.VISIBLE
                }
            }
        })
    }
}