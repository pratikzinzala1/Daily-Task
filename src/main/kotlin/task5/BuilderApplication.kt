package task5

fun main(){

    val shaktiDeveloper:BuilderAbstracts = ShaktiDeveloper()
    shaktiDeveloper.printPersonalDetails()
    shaktiDeveloper.printListOfProjectDone(100)
    shaktiDeveloper.addReview("They really bad developer - rahul yadav")
    shaktiDeveloper.printReviews()



    val dilipDeveloper:BuilderAbstracts = DilipDeveloper()
    dilipDeveloper.printPersonalDetails()
    dilipDeveloper.printListOfProjectDone(true)
    dilipDeveloper.printReviews()

    val sharjaBuildig:BuildingAbstracts = SharjaBuildig()
    sharjaBuildig.printBuildingDetail()
    sharjaBuildig.setSolarAvailability(true)
    sharjaBuildig.supplyElectricity(false)
    sharjaBuildig.setWaterAvailability(true)
    sharjaBuildig.supplyWater()

    val shubhdarshanBuilding:BuildingAbstracts = ShubhdarshanBuilding()
    shubhdarshanBuilding.printBuildingDetail()
    shubhdarshanBuilding.supplyWater(false)
    shubhdarshanBuilding.supplyElectricity(false)


}