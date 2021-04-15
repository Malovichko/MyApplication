package com.example.myapplication.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.ExampleItem
import com.example.myapplication.data.ExampleRectangleItem
import com.example.myapplication.data.ExampleSquareItem

class ExampleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList = arrayListOf<ExampleItem>()

//    constructor(context : Context,  exampleItems: List<ExampleItem>, onClickListener: OnItemClickListener)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            SQUARE_ITEM -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.item_example_square_view,
                        parent,
                        false
                    )
                ExampleSquareViewHolder(view)
            }
            RECTANGULAR_ITEM -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_example_rectangle_view, parent, false)
                ExampleRectangleViewHolder(view)
            }
            else -> throw ClassCastException()
        }
    }

    override fun getItemCount(): Int = itemList.size

//    internal interface OnItemClickListener {
//        fun onStateClick(itemExample: ExampleItem?, position: Int)
//    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val currentItem = itemList[position]) {
            is ExampleSquareItem -> (holder as ExampleSquareViewHolder).bind(currentItem)
            is ExampleRectangleItem -> (holder as ExampleRectangleViewHolder).bind(currentItem)
        }
//        holder.itemView.setOnClickListener(View.OnClickListener {
//            override fun onClick(it) {
//            }
//        })
    }

    fun setUpExampleItemList(list: ArrayList<ExampleItem>) {
        itemList = list
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemList[position]) {
            is ExampleRectangleItem -> RECTANGULAR_ITEM
            is ExampleSquareItem -> SQUARE_ITEM
        }
    }

    companion object {
        private const val SQUARE_ITEM = 0
        private const val RECTANGULAR_ITEM = 1
    }
}
