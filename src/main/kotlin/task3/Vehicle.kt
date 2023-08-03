package task3

import task1.Alloy

enum class FuelType{
    PETROL,DIESEL,CNG
}

interface Vehicle {

    val alloy: Alloy

    val engineNumber: Int

    val vehiclePrice: Int

    val paymentMode: PaymentMode

    val fuelType: FuelType

    val numberOfTyre: Int

    val numberOfDoors: Int

    val maxSpeed: Int

    val isRunning:Boolean

    val isStarted:Boolean

    val vehicleKey:Int

    fun getDetails()
    fun buyCar(amount: Int, paymentType: PaymentMode)
    fun buyCar(amount: Int, paymentType: PaymentMode, discount: Int)

    fun start(key: Int,callBack: (Boolean) -> Unit)
    fun start(key: Int, fuelType: FuelType,callBack: (Boolean) -> Unit)

    fun stop()



}