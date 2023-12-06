package com.example.knowyourgrow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private var plantlist: ArrayList<PlantModel>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_list, parent, false)
        return MyViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return plantlist.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentPlant = plantlist[position]
        holder.plantName.text = currentPlant.plantName
        holder.waterFrequency.text = currentPlant.waterFrequency.toString()
        holder.sunlight.text = currentPlant.sunlight
    }

    fun updateData(newPlantList: List<PlantModel>) {
        plantlist = newPlantList as ArrayList<PlantModel>
        notifyDataSetChanged()
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val plantName: TextView = itemView.findViewById(R.id.plantName)
        val waterFrequency: TextView = itemView.findViewById(R.id.waterFrequency)
        val sunlight: TextView = itemView.findViewById(R.id.sunlight)


    }
}
