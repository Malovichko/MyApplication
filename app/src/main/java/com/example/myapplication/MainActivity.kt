package com.example.myapplication


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.DataFactory
import com.example.myapplication.list.ExampleAdapter
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var infoButton: ImageView
    private lateinit var homeButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        initListener()
    }

    private fun init() {
        infoButton = findViewById(R.id.button_info)
        homeButton = findViewById(R.id.button_home)

        val gridLayoutManager = GridLayoutManager(this, 2)
        val decorator = CharacterItemDecoration()
        recyclerView = findViewById(R.id.recycler_view_item)
        recyclerView.addItemDecoration(decorator)
        val adapter = ExampleAdapter()
        adapter.setUpExampleItemList(DataFactory.getStaffList())
        recyclerView.adapter = adapter
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return if (position == 8 || position == 6 || position == 7 || position == 9) {
                    2
                } else 1
            }
        }
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)
    }

    private fun initListener() {
        recyclerView.addOnItemTouchListener(
            RecyclerItemClickListener(
                this,
                recyclerView,
                object : RecyclerItemClickListener.OnItemClickListener {
                    override fun onItemClick(view: View?, position: Int) {
                        showSnackBar("Черт его знает, куда нажали! Не разобралась, как отобразить заголовок нажатой карточки")
                    }

                    override fun onLongItemClick(view: View?, position: Int) {
                        showSnackBar("А еще отсуп от тулбара неправильный, черт знает, как исправить")
                    }
                })
        )

        infoButton.setOnClickListener {
            val dialog = DialogScreen.getDialog(this, DialogScreen.IDD_ABOUT)
            dialog?.show()
        }

        homeButton.setOnClickListener {
            Toast.makeText(this, "Нажали на домик", Toast.LENGTH_LONG).show()
        }
    }

    fun showSnackBar(text: String) {
        Snackbar.make(recyclerView, text, Snackbar.LENGTH_LONG).show()
    }
}