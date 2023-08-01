package task2

import task1.Alloy

open class Vehicle{
    open var alloy: Alloy = Alloy.ALLOY1

    open var engineNumber : Int = 0

    open var vehiclePrice:Int = 0

    open var paymentMode:PaymentMode  = PaymentMode.NO_PAYMENT

}