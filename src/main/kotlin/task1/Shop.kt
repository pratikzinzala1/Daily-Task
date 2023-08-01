package task1

class Shop() {

    fun updateAlloy(car: Car) {
        println("Changing Alloy ........")
        Thread.sleep(2000)
        car.alloy = Alloy.ALLOY3
    }
}