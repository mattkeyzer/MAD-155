package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        //val names = arrayListOf("Bart","Paul","Drummer","Piper","Mayonnaise")

        var list = ArrayList<Model>()

        list.add(Model("Paul","He is a super cool kitty who loves chicken", R.drawable.img9353))
        list.add(Model("Bart","He is a super silly lizard who loves lettuce", R.drawable.img9574))




        listView.adapter = MyCustomAdapter(this,R.layout.custom_item_layout,list)
    }


}