package task3

import task1.Alloy


open class Car: Vehicle {
    open val carName: String = ""

    open fun hasSafetyFeature(hasSeatbelt:Boolean){
        println("Car only has seatbelt")
    }
    open fun hasSafetyFeature(hasSeatbelt: Boolean,hasAirBags:Boolean){
        println("Car has both seatbelt and airbags")
    }

    override val alloy: Alloy = Alloy.ALLOY1
    override val engineNumber: Int = 0
    override val vehiclePrice: Int = 0
    override val paymentMode: PaymentMode = PaymentMode.NO_PAYMENT
    override val numberOfDoors: Int = 4
    override val isRunning: Boolean = false
    override val vehicleKey: Int = 0

    final override val fuelType: FuelType =FuelType.PETROL
    final override val numberOfTyre: Int = 4
    final override val maxSpeed: Int = 400

    override fun getDetails() {
        println("fuelType of the car is $fuelType")
        println("number of tyre is $numberOfTyre")
        println("maximum speed of the car is ${maxSpeed}")
    }

    override fun buyCar(amount: Int, paymentType: PaymentMode) {}

    override fun buyCar(amount: Int, paymentType: PaymentMode, discount: Int) {}

    override fun start(key: Int) {}

    override fun start(key: Int, fuelType: FuelType) {}

    override fun stop() {}


}