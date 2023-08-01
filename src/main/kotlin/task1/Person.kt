package task1

class Person(var name: String) {
    var currentCar: Car? = null
    fun buyCar(newCar: Car) {
        currentCar = newCar
        println("$name has bought new car ${newCar.carName}")
    }

    fun showAlloy(alloy: Alloy, callback: (String) -> Unit) {
        if (alloy == Alloy.ALLOY1) {
            callback("${name} said I don't like this $alloy go and change it")

        } else {
            callback("This is fine")
        }
    }

    fun printCarDetail() {
        println("Current car is ${currentCar!!.carName} and Alloy is ${currentCar?.alloy}")
    }

}