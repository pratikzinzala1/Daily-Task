package test.task2



fun main() {

    val b1 = Bike(12, "Single Piston")
    b1.printBike()

    val c1 = Car(123,"V8-Engine",4)
    c1.printCar()
}

class Bike : Vehicles {

    private lateinit var bikeType: String


    constructor() : super() {
        println("Bike has been Created")
    }

    constructor(key: Int) : super(key) {
        this.key = key
        println("Bike key is $key")
    }

    constructor(key: Int, engine: String,fuelType: String="Petrol") : super(key, engine,fuelType) {
        println("Bike Engine is $engine")
    }

    constructor(key: Int, engine: String, bikeType: String, fuelType: String="Petrol") : super(key, engine,fuelType) {
        this.bikeType = bikeType
        println("Bike is a $bikeType bike")
    }


    fun printBike() {
        println("Key is : ${super.key} Engine is : ${super.engine} FuelType : ${super.fuelType}")
    }

}

class Car : Vehicles {
    private lateinit var name: String
    private var numberOfSeat: Int = 0

    private
    constructor(name: String) : super() {
        this.name = name
        println("Car has been Created")
    }

    constructor(key: Int) : super(key) {
        println("Car key is $key")
    }

    constructor(key: Int, engine: String) : super(key, engine) {

        println("Car Engine is $engine")
    }

    constructor(key: Int, engine: String, numberOfSeat: Int,fuelType: String="Petrol") : super(key, engine,fuelType) {
        this.numberOfSeat = numberOfSeat
        this.fuelType = fuelType
        println("Car has $numberOfSeat seat")
    }

    fun printCar() {

        println("Key is : ${super.key} Engine is : ${super.engine} FuelType : ${super.fuelType}")
    }

}


open class Vehicles() {
    protected var key: Int = 0
    protected var engine: String = ""
    protected var fuelType: String = ""

    constructor(key: Int) : this() {
        this.key = key
        println("Vehicle Key is $key")
    }

    constructor(key: Int, engine: String) : this(key) {
        this.engine = engine
        println("Vehicle Engine is $engine")
    }

    constructor(key: Int, engine: String, fuelType: String = "Petrol") : this(key, engine) {
        this.fuelType = fuelType
        println("Vehicle uses $fuelType")
    }


}