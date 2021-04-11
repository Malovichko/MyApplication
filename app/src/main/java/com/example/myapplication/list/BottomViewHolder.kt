package com.example.myapplication.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.StaffModel

class BottomViewHolder constructor(private val staffView: View) :
    RecyclerView.ViewHolder(staffView) {

    private lateinit var icon: ImageView
    private lateinit var textName: TextView
    private lateinit var textPrice: TextView

    fun bind(model: StaffModel) {
        icon = staffView.findViewById(R.id.image_view)
        textName = staffView.findViewById(R.id.text_item_title)
        textPrice = staffView.findViewById(R.id.text_item_bottom_title)

        icon.setImageDrawable(ContextCompat.getDrawable(staffView.context, model.icon))
        textName.text = model.name
        textPrice.text = model.price
    }

}