package com.example.myapplication.list

import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.ExampleRectangleItem

class ExampleRectangleViewHolder constructor(private val staffView: View) :
    RecyclerView.ViewHolder(staffView) {

    private lateinit var icon: ImageView
    private lateinit var textTitle: TextView

    fun bind(model: ExampleRectangleItem) {
        icon = staffView.findViewById(R.id.item_rectangle_image_view)
        textTitle = staffView.findViewById(R.id.item_rectangle_text_title)

        icon.setImageDrawable(ContextCompat.getDrawable(staffView.context, model.icon))
        textTitle.text = model.title
    }
}