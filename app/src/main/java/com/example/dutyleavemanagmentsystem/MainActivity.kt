package com.example.dutyleavemanagmentsystem

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var homeContent: FrameLayout
    private lateinit var eventsContent: FrameLayout
    private lateinit var historyContent: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        homeContent = findViewById(R.id.home_content)
        eventsContent = findViewById(R.id.events_content)
        historyContent = findViewById(R.id.history_content)

        // Set listener for when the user selects a tab
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_home -> {
                    // Show Home content and hide others
                    homeContent.visibility = View.VISIBLE
                    eventsContent.visibility = View.GONE
                    historyContent.visibility = View.GONE
                    true
                }
                R.id.menu_events -> {
                    // Show Events content and hide others
                    homeContent.visibility = View.GONE
                    eventsContent.visibility = View.VISIBLE
                    historyContent.visibility = View.GONE
                    true
                }
                R.id.menu_history -> {
                    // Show History content and hide others
                    homeContent.visibility = View.GONE
                    eventsContent.visibility = View.GONE
                    historyContent.visibility = View.VISIBLE
                    true
                }
                else -> false
            }
        }
    }
}