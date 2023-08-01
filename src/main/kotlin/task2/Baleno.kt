package task2

class Baleno(override val carName: String): Car(){
    init {
        println("Baleno created")
    }

    override var engineNumber: Int = 99
    fun start(ignite:Boolean){
        println("${carName} Engine started with petrol")
    }
    fun start(ignite: Boolean,withCng:Boolean){
        println("${carName} Engine started with CNG")
    }

    fun setPayment(amount:Int,paymentType:PaymentMode){
        vehiclePrice = amount
        paymentMode = paymentType
        println("$carName price is $vehiclePrice and payment mode is $paymentMode")
    }
    fun setPayment(amount:Int,paymentType:PaymentMode,discount:Int){
        vehiclePrice = amount - discount
        paymentMode = paymentType
        println("$carName price is $vehiclePrice and payment mode is $paymentMode")
    }


}