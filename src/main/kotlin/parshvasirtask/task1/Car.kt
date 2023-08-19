package parshvasirtask.task1

data class Car(

    val carName: String,
    val modelName: String,
    val maxSpeed: Int,
    var currentSpeed: Int,
    val carId: Int = GenerateUID.UID()


) {
    fun updateSpeed(speed: Int) {
        if (speed < maxSpeed) {
            currentSpeed += speed
        } else {
            currentSpeed = maxSpeed
            println("max speed reached")
        }

    }

    fun breakCar(speed: Int) {
        val newSpeed = currentSpeed - speed
        if (newSpeed > 0) {
            currentSpeed = newSpeed
        } else {
            stopCar()
        }
    }

    fun stopCar() {
        currentSpeed = 0
        println("Car Stop")
    }

    fun printCartDetails() {
        println("********************************************")
        println(
            " Car ID : ${carId} " +
                    "\n Car Name : ${carName}" +
                    "\n Model Name : ${modelName} " +
                    "\n Max Speed : ${maxSpeed} " +
                    "\n Current Speed : ${currentSpeed}"
        )
        println("********************************************")
    }
}

