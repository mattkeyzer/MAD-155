package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.recyclerview.adapters.MyAdapter
import com.example.recyclerview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(false)

        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter


    }



    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        items.add(MyModel(R.drawable.tiger, "Tiger"))
        return items

    }
}