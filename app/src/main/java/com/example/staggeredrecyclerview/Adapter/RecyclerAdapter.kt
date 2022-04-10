package com.example.staggeredrecyclerview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.staggeredrecyclerview.Model.RecyclerModel
import com.example.staggeredrecyclerview.R
import com.google.android.material.snackbar.Snackbar

/**
 * The class that bothers itself with displaying the items in a [RecyclerView] format
 */
class RecyclerAdapter(
    private val context: Context,
    private val myView: View,
    private val dataList: List<RecyclerModel>
    ) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.imageView)!!
        val cardView = view.findViewById<CardView>(R.id.card)!!
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.layout_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recyclerModel = dataList[position]

        // Image set to the imageview widget
        holder.imageView.setImageResource(recyclerModel.image)

        // Assigns a [OnLongClickListener] to the cardView
        holder.cardView.setOnLongClickListener {info(position + 1)}

        // Assigns a [OnClickListener] to the cardView
        holder.cardView.setOnClickListener {addInfo(position + 1)}

    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataList.size

    /**
     * To display a simple [Toast] message base on the item the user taps
     */
    private fun info(num : Int): Boolean {
        val text = context.resources.getString(R.string.itemTap, num)
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        return true
    }

    /**
     * Displays a notification [Snackbar] when called upon
     */
    private fun addInfo(num: Int): Boolean {
        val text = context.resources.getString(R.string.itemTap, num)
        Snackbar.make(
            myView,
            text,
            Snackbar.LENGTH_SHORT
        ).show()
        return true
    }
}