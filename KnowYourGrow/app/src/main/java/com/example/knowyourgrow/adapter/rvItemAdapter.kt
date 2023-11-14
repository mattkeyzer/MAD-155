package com.example.knowyourgrow.adapter

import android.content.ClipData.Item
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.knowyourgrow.R
import com.example.knowyourgrow.models.rvItemModel

class rvItemAdapter(var arrayList: ArrayList<rvItemModel>):
            RecyclerView.Adapter<rvItemAdapter.ItemHolder>(){


    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var plantImage = itemView.findViewById<ImageView>(R.id.rvItemImage)
        var textPlantName = itemView.findViewById<TextView>(R.id.plantName)
        var textPlantDescription = itemView.findViewById<TextView>(R.id.plantDescription)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.rvitem, parent, false)
        return  ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
       // var plant: rvItemModel = arrayList.get(position)
        holder.plantImage.setImageResource(arrayList[position].plantImage!!)
        holder.textPlantName.text = arrayList[position].textPlantName
        holder.textPlantDescription.text = arrayList[position].textPlantDescription
        holder.textPlantName.setOnClickListener{
          //  Toast.makeText(requireContext(),plant.textPlantName,Toast.LENGTH_LONG).show()
        }

    }
}