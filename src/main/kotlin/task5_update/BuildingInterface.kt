package task5_update

import task5.HouseType
import task5.PowerSupplyMode
import task5.WaterSupplyMode

interface BuildingInterface {


    fun printBuildingDetail()


    fun supplyElectricity()

    fun supplyElectricity(stop: Boolean)

    fun supplyWater()

    fun supplyWater(stop: Boolean)

    fun setSolarAvailability(isSolarAvailable: Boolean)

    fun setWaterAvailability(isOwnWaterSupplyAvailable: Boolean)

}