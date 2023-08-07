package task5_update

import task5.HouseType

fun main() {

    val shaktiDeveloper: BuilderInterface = Builder("shakti", true, 10_00_000, 4)
    shaktiDeveloper.addProject(
        listOf(
            Project("OnePoint", "KKV Hall,Rajkot", 80, true),
            Project("Vistara", "150 Road,Ahmedabad", 40, true),
            Project("Engineering college", "kankot,Rajkot", 100, false),
            Project("Green Mega mall", "kaliyabid,Bhavnagar", 25, true),
            Project("Multi Complex", "varacha,Surat", 50, false)
        )
    )
    shaktiDeveloper.printPersonalDetails()
    shaktiDeveloper.printListOfProjectDone(100)
    shaktiDeveloper.addReview("They really bad developer - rahul yadav")
    shaktiDeveloper.printReviews()


    val dilipDeveloper: BuilderInterface = Builder("Dilip", true, 90_00_000, 5)
    dilipDeveloper.addProject(
        listOf(
            Project("OnePoint", "KKV Hall,Rajkot", 80, true),
            Project("Vistara", "150 Road,Ahmedabad", 40, true),
            Project("Engineering college", "kankot,Rajkot", 100, false),
            Project("Green Mega mall", "kaliyabid,Bhavnagar", 25, true),
            Project("Multi Complex", "varacha,Surat", 50, false)
        )
    )
    dilipDeveloper.addReview(
        listOf(
            "They are really good developer - umang savaliya",
            "Best service with good quality - hardik zinzala"
        )
    )
    dilipDeveloper.printPersonalDetails()
    dilipDeveloper.printListOfProjectDone(true)
    dilipDeveloper.printReviews()


    val sharjaBuildig: BuildingInterface = Building(
        "Sharja",
        10,
        "Sandhi",
        true,
        50,
        30,
        "New town",
        "Parnil",
        "01/01/2035",
        HouseType.APARTMENT,
        true,
        true
    )
    sharjaBuildig.printBuildingDetail()
    sharjaBuildig.setSolarAvailability(true)
    sharjaBuildig.supplyElectricity(false)
    sharjaBuildig.setWaterAvailability(true)
    sharjaBuildig.supplyWater()

    val shubhdarshanBuilding: BuildingInterface = Building(
        "Shubhdarshan",
        5,
        "ambuja",
        true,
        20,
        10,
        "old Town",
        "Hardik",
        "01/01/2045",
        HouseType.TENEMENT,
        true,
        false
    )
    shubhdarshanBuilding.printBuildingDetail()
    shubhdarshanBuilding.supplyWater(false)
    shubhdarshanBuilding.supplyElectricity(false)


}