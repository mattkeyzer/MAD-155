package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter(var ctx: Context, var ourResource: Int, var Items: ArrayList<Model>): ArrayAdapter<Model>(ctx, ourResource,Items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource,null)

        val img = view.findViewById<ImageView>(R.id.img)
        val name = view.findViewById<TextView>(R.id.name)
        val discription = view.findViewById<TextView>(R.id.discription)

        name.text = Items[position].name
        discription.text = Items[position].discription
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))




        return view
    }

}