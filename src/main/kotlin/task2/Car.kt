package task2

open class Car: Vehicle() {
    open val carName: String = ""
    final override val numberOfTyre: Int = 4
    final override val engineType:String = "petrol"

    open fun hasSafetyFeature(hasSeatbelt:Boolean){
        println("Car only has seatbelt")
    }
    open fun hasSafetyFeature(hasSeatbelt: Boolean,hasAirBags:Boolean){
        println("Car has both seatbelt and airbags")
    }




}