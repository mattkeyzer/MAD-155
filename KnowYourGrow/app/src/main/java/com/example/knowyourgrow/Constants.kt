package com.example.knowyourgrow

object Constants {

    private val plantList = ArrayList<PlantModel>()

    // for adding initial data
    init {

    }

    // Get the current plant list
    fun getPlantData(): ArrayList<PlantModel> {
        return plantList
    }

    // Add a new plant to the list
    fun addPlant(plant: PlantModel) {
        plantList.add(plant)
    }
}
