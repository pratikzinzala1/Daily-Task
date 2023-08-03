package task3

class Baleno(override val carName: String) : Car() {
    init {
        println("$carName created")
        hasSafetyFeature(hasSeatbelt = true, hasAirBags = true)
    }

    override var vehicleKey: Int = 0
        private set
    override val engineNumber: Int = 101
    override var isStarted: Boolean = false
    override var vehiclePrice: Int = 0
    override var paymentMode: PaymentMode = PaymentMode.NO_PAYMENT


    fun setCarKey(key: Int, callBack: (Int) -> Unit) {
        vehicleKey = key
        callBack(vehicleKey)
    }

    override var isRunning: Boolean = false

    fun driveCar() {
        if (isStarted) {
            isRunning = true
            println("Car is Running..........")
        } else {
            println("Start car first")
        }

    }

    override fun start(key: Int,callBack: (Boolean) -> Unit) {
        if (vehicleKey == key) {
            isStarted = true
            println("Car has started..........")
            callBack(vehicleKey==key)
        } else {
            println("Please insert original key")
            callBack(vehicleKey==key)
        }
    }

    override fun start(key: Int, fuelType: FuelType,callBack: (Boolean) -> Unit) {
        if (vehicleKey == key) {
            isStarted = true
            when(fuelType){
                FuelType.CNG->{
                    println("Car has started using CNG Gas..........")
                }
                FuelType.DIESEL->{
                    isStarted = false
                    println("Car get malfunction due to using wrong fuel")
                }
                FuelType.PETROL->{

                }
            }
            callBack(vehicleKey==key)
        } else {
            println("Please insert original key")
            callBack(vehicleKey==key)
        }
    }

    override fun stop() {
        if (isStarted||isRunning){
            isRunning = false
            isStarted = false
            println("Car get stopped..........")
        }
        else{
            println("Car already stopped..........")
        }

    }


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
        println(
            "Car name is $carName and engine number is $engineNumber" +
                    "\nnumber of tyre is $numberOfTyre and doors is $numberOfDoors"
        )

    }

}