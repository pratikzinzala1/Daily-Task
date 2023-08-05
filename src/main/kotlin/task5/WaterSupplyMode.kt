package task5

enum class WaterSupplyMode {
    BORE_WELL,MUNICIPALITY,NO_WATER_SUPPLY;

    fun printWaterSupply(buildingName:String){
        println()
        when(this){
            BORE_WELL-> println("$buildingName Water supply started with bore well water")
            MUNICIPALITY-> println("$buildingName Water supply started with municipality water")
            NO_WATER_SUPPLY-> println("$buildingName Water supply Stop")
        }
        println()
    }
}