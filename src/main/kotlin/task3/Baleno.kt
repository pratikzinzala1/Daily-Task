package task3

class Baleno(override val carName: String): Car(){
    init {
        println("$carName created")
        hasSafetyFeature(true,true)
    }

    override var vehicleKey: Int = 0
        private set
    override val engineNumber: Int = 101

    fun setCarKey(key:Int){
        vehicleKey = key
    }

    override var vehiclePrice: Int = 0
    override var paymentMode: PaymentMode = PaymentMode.NO_PAYMENT

    override fun buyCar(amount: Int, paymentType: PaymentMode) {
        vehiclePrice = amount
        paymentMode = paymentType
        println("$carName price is $vehiclePrice and payment mode is $paymentMode")
    }

    override fun buyCar(amount: Int, paymentType: PaymentMode, discount: Int) {
        vehiclePrice = amount - discount
        paymentMode = paymentType
        println("original price is $amount")
        println("$carName price is $vehiclePrice after discount and payment mode is $paymentMode")
    }


    override fun getDetails() {
        super.getDetails()
        println("Car name is $carName and engine number is $engineNumber" +
                "\nnumber of tyre is $numberOfTyre and doors is $numberOfDoors")

    }

}