package com.example.knowyourgrow.models

class rvItemModel {
    var plantImage: Int?
    var textPlantName: String?
    var textPlantDescription: String?

    constructor(plantImage: Int?, textPlantName: String?, textPlantDescription: String?){
        this.plantImage = plantImage
        this.textPlantName = textPlantName
        this.textPlantDescription =textPlantDescription
    }

}