package task2

import task1.Alloy

open class Vehicle{

    open var alloy: Alloy = Alloy.ALLOY1

    open var engineNumber : Int = 0

    open var vehiclePrice:Int = 0

    open var paymentMode:PaymentMode  = PaymentMode.NO_PAYMENT

    open var fuelType:String = "petrol"

    open val numberOfTyre:Int = 0

    open val numberOfDoors:Int = 0

    open val maxSpeed:Int = 0

    open val engineType:String = ""
    open fun getDetails(){
        println("vehicle alloy is $alloy")
    }
    open fun setPayment(amount:Int,paymentType:PaymentMode){}
    open fun setPayment(amount:Int,paymentType:PaymentMode,discount:Int){}

    open fun start(ignite:Boolean){}
    open fun start(ignite: Boolean,withCng:Boolean){}

    open fun isRunning(isRunning:Boolean){}


}