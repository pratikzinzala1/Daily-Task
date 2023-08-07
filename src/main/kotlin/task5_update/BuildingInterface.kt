package task5_update

import task5.HouseType
import task5.PowerSupplyMode
import task5.WaterSupplyMode

interface BuildingInterface {
    var buildingName: String
    var buildingFloors: Int
    var cementType: String
    var liftAvailability: Boolean
    var parkingCapacityForBike: Int
    var parkingCapacityForCar: Int
    var address: String
    var owner: String
    var expiryDate: String
    var houseType: HouseType
    var isSoloarAvailable: Boolean
    var powerSupplyMode: PowerSupplyMode

    var isOwnWellIsAvailable: Boolean
    var waterSupplyMode: WaterSupplyMode

    fun printBuildingDetail()


    fun supplyElectricity()

    fun supplyElectricity(stop: Boolean)

    fun supplyWater()

    fun supplyWater(stop: Boolean)

    fun setSolarAvailability(isSolarAvailable: Boolean)

    fun setWaterAvailability(isOwnWaterSupplyAvailable: Boolean)

}