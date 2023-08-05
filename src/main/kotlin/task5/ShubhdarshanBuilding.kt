package task5

class ShubhdarshanBuilding:BuildingAbstracts() {
    override val buildingName: String = "Shubhdarshan Apartment"
    override val buildingFloors: Int = 5
    override val cementType: String = "Ultra track"
    override val liftAvailability: Boolean = false
    override val parkingCapacityForBike: Int = 30
    override val parkingCapacityForCar: Int = 10
    override val address: String = "S.G Highway,Ahmedabad"
    override var owner: String = "parnil makwana"
    override val expiryDate: String = "01/09/2045"
    override val houseType: HouseType = HouseType.APARTMENT
    override var isSoloarAvailable: Boolean = false
    override var powerSupplyMode: PowerSupplyMode = PowerSupplyMode.NO_SUPPLY
    override var isOwnWellIsAvailable: Boolean = false

    override var waterSupplyMode: WaterSupplyMode=WaterSupplyMode.NO_WATER_SUPPLY

    override fun printBuildingDetail() {
        super.printBuildingDetail()
        println("We do not celebrate holly only")
    }
}