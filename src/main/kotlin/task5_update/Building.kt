package task5_update

import task5.HouseType
import task5.PowerSupplyMode
import task5.WaterSupplyMode


class Building(
    private var buildingName: String,
    private var buildingFloors: Int,
    private var cementType: String,
    private var liftAvailability: Boolean,
    private var parkingCapacityForBike: Int,
    private var parkingCapacityForCar: Int,
    private var address: String,
    private var owner: String,
    private var expiryDate: String,
    private var houseType: HouseType,
    private var isSoloarAvailable: Boolean,

    private var isOwnWellIsAvailable: Boolean,

    ) : BuildingInterface {

    private var powerSupplyMode: PowerSupplyMode = PowerSupplyMode.NO_SUPPLY
    private var waterSupplyMode: WaterSupplyMode = WaterSupplyMode.NO_WATER_SUPPLY
    override fun printBuildingDetail() {
        println()
        println("Building Name : $buildingName which has following facility")
        println("Building type : $houseType")
        println("No of Floors : $buildingFloors")
        println("Cement type : $cementType")
        println("Lift availability : ${if (liftAvailability) "Yes" else "No"}")
        println("Parking capacity for bike : $parkingCapacityForBike")
        println("Parking capacity for car : ${parkingCapacityForCar}")
        println("Location : $address")
        println("Owner : $owner")
        println("Expiry Date : $expiryDate")
        println()
    }


    override fun supplyElectricity() {
        if (isSoloarAvailable) {
            powerSupplyMode = PowerSupplyMode.SOLAR
            powerSupplyMode.printSupply(buildingName)
        } else {
            powerSupplyMode = PowerSupplyMode.METER_CONNECTION
            powerSupplyMode.printSupply(buildingName)
        }
    }

    override fun supplyElectricity(stop: Boolean) {
        if (stop) {
            powerSupplyMode = PowerSupplyMode.NO_SUPPLY
            powerSupplyMode.printSupply(buildingName)
        } else {
            supplyElectricity()
        }

    }

    override fun supplyWater() {
        if (isOwnWellIsAvailable) {
            waterSupplyMode = WaterSupplyMode.BORE_WELL
            waterSupplyMode.printWaterSupply(buildingName)
        } else {
            waterSupplyMode = WaterSupplyMode.MUNICIPALITY
            waterSupplyMode.printWaterSupply(buildingName)
        }
    }

    override fun supplyWater(stop: Boolean) {
        if (stop) {
            waterSupplyMode = WaterSupplyMode.NO_WATER_SUPPLY
            waterSupplyMode.printWaterSupply(buildingName)
        } else {
            supplyWater()
        }

    }

    override fun setSolarAvailability(isSolarAvailable: Boolean) {
        this.isSoloarAvailable = isSolarAvailable
    }

    override fun setWaterAvailability(isOwnWaterSupplyAvailable: Boolean) {
        this.isOwnWellIsAvailable = true
    }


}