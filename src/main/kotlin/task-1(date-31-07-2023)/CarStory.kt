package `task-1(date-31-07-2023)`


class Alloy {
    companion object {
        const val alloy1 = "alloy1"
        const val alloy2 = "alloy2"
        const val alloy3 = "alloy3"
    }
}

class Shop() {

    fun updateAlloy(car: Car) {
        println("Changing Alloy ........")
        Thread.sleep(2000)
        car.alloy = Alloy.alloy3
    }
}

class Car(var carName: String) {

    init {
        println("$carName Created")
    }

    var alloy: String = Alloy.alloy1


}

class Person(var name: String) {
    var currentCar: Car? = null

    fun buyCar(newCar: Car) {
        currentCar = newCar
        println("$name has bought new car ${newCar.carName}")
    }

    fun showAlloy(alloy: String, callback: (String) -> Unit) {
        if (alloy == Alloy.alloy1) {
            callback("${name} said I don't like this $alloy go and change it")

        } else {
            callback("This is fine")
        }
    }

    fun printCarDetail() {
        println("Current car is ${currentCar!!.carName} and Alloy is ${currentCar?.alloy}")
    }

}

fun main() {

    val shop = Shop()
    val baleno1 = Car("baleno1")
    val baleno2 = Car("baleno2")

    val mayur = Person("mayur")
    mayur.buyCar(baleno2)
    val nishit = Person("nishit")
    nishit.buyCar(baleno2)

    val yug = Person("yug")

    yug.showAlloy(mayur.currentCar!!.alloy) {
        println(it)
    }

    shop.updateAlloy(mayur.currentCar!!)
    mayur.printCarDetail()
    yug.showAlloy(mayur.currentCar!!.alloy) {
        println(it)
    }

}