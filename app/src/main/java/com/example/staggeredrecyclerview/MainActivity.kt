package com.example.staggeredrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.staggeredrecyclerview.Adapter.RecyclerAdapter
import com.example.staggeredrecyclerview.data.Datasource
import com.example.staggeredrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Hide the system bars
        hideSystemBars()

        setContentView(binding.root)

        // Get all the values for the datasource and store it in a list
        val myDataset = Datasource().loadValues()

        // Initialize the views
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        val linearView = findViewById<LinearLayout>(R.id.linearLayout)

        // Call the recyclerview and pass in the required parameters
        recyclerview.adapter = RecyclerAdapter(this, linearView, myDataset)

    }

    /**
     * When called upon they hide the system bars
     */
    private fun hideSystemBars() {
        val windowInsetsController =
                ViewCompat.getWindowInsetsController(window.decorView) ?: return
        // Configure the behavior of the hidden system bars
        windowInsetsController.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        // Hide both the status bar and the navigation bar
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }

}