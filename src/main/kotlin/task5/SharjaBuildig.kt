package task5

class SharjaBuildig:BuildingAbstracts() {
    override val buildingName: String = "Sharja-Building"
    override val buildingFloors: Int = 10
    override val cementType: String = "Ambuja"
    override val liftAvailability: Boolean = true
    override val parkingCapacityForBike: Int = 50
    override val parkingCapacityForCar: Int = 20
    override val address: String = "KKV,Rajkot"

    override var owner: String = "parag Hadiya"
    override val expiryDate: String = "01/02/2034"
    override val houseType: HouseType =HouseType.APARTMENT

    override var isSoloarAvailable:Boolean = false
    override var powerSupplyMode:PowerSupplyMode = PowerSupplyMode.NO_SUPPLY

    override var isOwnWellIsAvailable:Boolean = false
    override var waterSupplyMode:WaterSupplyMode = WaterSupplyMode.NO_WATER_SUPPLY

    override fun printBuildingDetail() {
        super.printBuildingDetail()
        println("We always celebrate all festival")
    }


}