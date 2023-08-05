package task5


abstract class BuildingAbstracts {
    protected abstract val buildingName:String
    protected abstract val buildingFloors:Int
    protected abstract val cementType:String
    protected abstract val liftAvailability:Boolean
    protected abstract val parkingCapacityForBike:Int
    protected abstract val parkingCapacityForCar:Int
    protected abstract val address:String
    protected abstract var owner:String
    protected abstract val expiryDate:String
    protected abstract val houseType:HouseType
    protected abstract var isSoloarAvailable:Boolean
    protected abstract var powerSupplyMode:PowerSupplyMode

    protected abstract var isOwnWellIsAvailable:Boolean
    protected abstract var waterSupplyMode:WaterSupplyMode

    open fun printBuildingDetail(){
        println()
        println("Building Name : $buildingName which has following facility")
        println("Building type : $houseType")
        println("No of Floors : $buildingFloors")
        println("Cement type : $cementType")
        println("Lift availability : ${if (liftAvailability) "Yes" else "No" }")
        println("Parking capacity for bike : $parkingCapacityForBike")
        println("Parking capacity for car : ${parkingCapacityForCar}")
        println("Location : $address")
        println("Owner : $owner")
        println("Expiry Date : $expiryDate")
        println()
    }


     open fun supplyElectricity(){
         if (isSoloarAvailable){
             powerSupplyMode = PowerSupplyMode.SOLAR
             powerSupplyMode.printSupply(buildingName)
         }
         else{
             powerSupplyMode = PowerSupplyMode.METER_CONNECTION
             powerSupplyMode.printSupply(buildingName)
         }
     }
     open fun supplyElectricity(stop: Boolean){
         if (stop){
             powerSupplyMode = PowerSupplyMode.NO_SUPPLY
             powerSupplyMode.printSupply(buildingName)
         }else{
             supplyElectricity()
         }

    }
    open fun supplyWater(){
        if (isOwnWellIsAvailable){
            waterSupplyMode = WaterSupplyMode.BORE_WELL
            waterSupplyMode.printWaterSupply(buildingName)
        }else{
            waterSupplyMode = WaterSupplyMode.MUNICIPALITY
            waterSupplyMode.printWaterSupply(buildingName)
        }
    }
    open fun supplyWater(stop:Boolean){
        if (stop){
            waterSupplyMode = WaterSupplyMode.NO_WATER_SUPPLY
            waterSupplyMode.printWaterSupply(buildingName)
        }
        else{
            supplyWater()
        }

    }
    open fun setSolarAvailability(isSolarAvailable:Boolean){
        this.isSoloarAvailable  = isSolarAvailable
    }
    open fun setWaterAvailability(isOwnWaterSupplyAvailable:Boolean){
        this.isOwnWellIsAvailable = true
    }


}