package task9

fun main(){

    val g1 = GaneshGlory("Ganesh11",12,4)
    g1.unlockBuilding()
    g1.startLift()
    g1.stopLift()
    g1.lockFloor(5)


    val aparHome = AparHome("AparHome",10)
    aparHome.modifyHome()
    aparHome.buildKitchen()

    println(AparHome.numberOfRoom)

}

class GaneshGlory:CommercialBuilding,BuildingInterface{

    private var buildingName:String
    private var numberOfFloor:Int = 0
    private var numberOfBlock:Int = 0

    constructor(name:String):super(){
        this.buildingName = name
    }

    constructor(name:String,numberOfFloor:Int):super(){
        this.buildingName = name
        this.numberOfFloor = numberOfFloor
    }

    constructor(name: String,numberOfFloor: Int,numberOfBlock:Int):this(name,numberOfFloor){
        this.numberOfBlock = numberOfBlock
    }

    override fun startLift() {
        println("starting lift $buildingName")
    }

    override fun stopLift() {
        println("stopping lift $buildingName")
    }

    override fun lockFloor(floorNumber: Int) {
        println("locking floor no $floorNumber at $buildingName")
    }

    override fun startWaterSupply() {
        println("starting water supply at $buildingName")
    }

    override fun startElectricity() {
        println("starting electricity supply at $buildingName")
    }

    override fun lockBuilding() {
        println("locking building $buildingName")
    }

    override fun unlockBuilding() {
        println("unlocking building $buildingName")
    }

}
class AparHome:ResidentialHome,BuildingInterface{


    companion object{
         var buildingName:String = ""
         var numberOfRoom:Int = 0
    }

    constructor(name:String):super(){
        buildingName = name
    }

    constructor(name:String,room:Int):super(){
        buildingName = name
        numberOfRoom = room
    }

    override fun buildKitchen() {
        println("Building kitchen in $buildingName")
    }

    override fun buildBackYard() {
        println("Building BackYard in $buildingName")

    }

    override fun modifyHome() {
        println("Modifying home $buildingName")
    }

    override fun startWaterSupply() {
        println("starting water supply at $buildingName")

    }

    override fun startElectricity() {
        println("starting electricity at $buildingName")
    }

    override fun lockBuilding() {
        println("locking building $buildingName")

    }

    override fun unlockBuilding() {
        println("unlocking building $buildingName")
    }
}



abstract class ResidentialHome{

    companion object{
        const val BUILDING_CODE = 999
    }
    constructor(){
        println("Residential home created")
    }

    abstract fun buildKitchen()
    abstract fun buildBackYard()
    abstract fun modifyHome()

}
abstract class CommercialBuilding{


    companion object{
        const val BUILDING_CODE = 123
    }

    constructor(){
        println("CommercialBuilding home created")
    }

    abstract fun startLift()

    abstract fun stopLift()

    abstract fun lockFloor(floorNumber: Int)

}



interface BuildingInterface{
    fun startWaterSupply()
    fun startElectricity()
    fun lockBuilding()
    fun unlockBuilding()

}