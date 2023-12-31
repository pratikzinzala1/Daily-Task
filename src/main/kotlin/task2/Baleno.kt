package task2

class Baleno(override val carName: String): Car(){
    init {
        println("$carName created")
        hasSafetyFeature(true,true)
    }


    override var engineNumber: Int = 99

    override val numberOfDoors: Int = 4

    override val maxSpeed:Int = 280
    override fun start(ignite:Boolean){
        println("${carName} Engine started with petrol")
    }
    override fun start(ignite: Boolean,withCng:Boolean){
        println("${carName} Engine started with CNG")
    }

    override fun hasSafetyFeature(hasSeatbelt: Boolean) {
        super.hasSafetyFeature(hasSeatbelt)
    }

    override fun hasSafetyFeature(hasSeatbelt: Boolean, hasAirBags: Boolean) {
        super.hasSafetyFeature(hasSeatbelt, hasAirBags)
    }

    override fun setPayment(amount:Int, paymentType:PaymentMode){
        vehiclePrice = amount
        paymentMode = paymentType
        println("$carName price is $vehiclePrice and payment mode is $paymentMode")
    }
    override fun setPayment(amount:Int,paymentType:PaymentMode,discount:Int){
        vehiclePrice = amount - discount
        paymentMode = paymentType
        println("$carName price is $vehiclePrice and payment mode is $paymentMode")
    }



    override fun getDetails() {
        super.getDetails()
        println("Car name is $carName and engine number is $engineNumber" +
                "\nnumber of tyre is $numberOfTyre and doors is $numberOfDoors" +
                "\nenginertype is $engineType")
    }

}