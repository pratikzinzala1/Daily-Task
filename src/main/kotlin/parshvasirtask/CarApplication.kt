package parshvasirtask
import java.lang.Exception
import java.lang.IllegalArgumentException


object GenerateUID {
    private val oldUid = mutableListOf<Int>()
    fun UID(): Int {
        val random = (1..1000).random()

        return if (oldUid.contains(random)) {
            UID()
        } else {
            oldUid.add(random)
            random
        }
    }
}

class CarData {
    val carList: MutableList<Car> = mutableListOf()
}
object CarList{
    val list = CarData().carList
}

fun main() {

    CarList.list.apply {
        add(Car("a", "a", 100, 20))
        add(Car("b", "b", 100, 20))
        add(Car("b", "b", 100, 20))
    }

    printMainOptions()

}
fun printMainOptions(){
    while (true) {
        println("-----------------------------------------------------------------")
        println("Please Enter Your Choice")
        println("1 for view car list")
        println("2 for search car or car operation")
        println("3 for adding car")
        println("-----------------------------------------------------------------")
        try {
            when (readln().toInt()) {
                1 -> showCartList()
                2 -> searchCar()
                3 -> addCar()
                else -> {
                    throw IllegalArgumentException("please enter valid number")
                }
            }

        } catch (e: Exception) {
            println("please enter valid number")
            continue
        }
    }

}

fun showCartList() {
    CarList.list.forEach {
        it.printCartDetails()
    }
}

fun searchCar(){

        val searchResult = mutableListOf<Int>()
        var selectedCar: Int? = null

        if (CarList.list.isEmpty()) {
            println("No cars are available")
            return
        }

        println("Please enter car name......")
        println("enter 0 for main menu......")
        val carName = readln()
        if (carName == "0") return
        for (i in CarList.list.indices) {
            if (CarList.list[i].carName == carName) {
                searchResult.add(i)
            }
        }
        if (searchResult.isEmpty()) {
            println("car does not exist")
            return
        }
        if (searchResult.size > 1) {
            println("please select car from given list")
            for (i in searchResult) {
                println("********************************************")
                println(
                    " Car ID : ${CarList.list[i].carId} " +
                            "\n Car Name : ${CarList.list[i].carName}" +
                            "\n Model Name : ${CarList.list[i].modelName} " +
                            "\n Max Speed : ${CarList.list[i].maxSpeed} " +
                            "\n Current Speed : ${CarList.list[i].currentSpeed}"
                )
                println("********************************************")
            }

            while (selectedCar == null) {
                println("enter car id.....")
                println("enter 0 for main menu")
                val carId = readln().toInt()

                if (carId == 0) return
                for (i in searchResult) {
                    if (CarList.list[i].carId == carId) {
                        selectedCar = i
                        break
                    }
                }
                println("Enter valid Car id")

            }


        } else {
            selectedCar = searchResult[0]
        }
        println("Your Selected Car is \n ${CarList.list[selectedCar]}")
        performOperation(CarList.list[selectedCar])




}
fun performOperation(selectedCar: Car) {


    while (true) {
        println("Select Operation to perform")
        println("1 for stop car")
        println("2 for break car")
        println("3 for increase speed")
        println("0 for main menu")
        when (readln().toInt()) {
            0 -> return
            1 -> selectedCar.stopCar()
            2 -> {
                println("Current speed is ${selectedCar.currentSpeed}")
                println("Enter speed you want to increase")
                val speedAddOn = readln().toInt()
                selectedCar.breakCar(speedAddOn)
                println("Current speed is ${selectedCar.currentSpeed}")
            }

            3 -> {
                println("Current speed is ${selectedCar.currentSpeed}")
                println("Enter speed you want to decrease")
                val speedSubOn = readln().toInt()
                selectedCar.updateSpeed(speedSubOn)
                println("Current speed is ${selectedCar.currentSpeed}")
            }

            else -> {
                continue
            }
        }

    }


}
fun addCar() {
    val pattern = "^[a-z]+[0-9]*"
    var carName:String
    var modelName:String
    var maxSpeed:Int
    var currentSpeed:Int
    println("please enter your car detail")
    w1@ while (true) {
        println("enter car name")
        carName = readln()
        if (Regex(pattern).matches(carName)) {
            break@w1
        } else {
            println("Enter valid name....")
        }
    }
    w2@ while (true) {
        println("enter model name")
        modelName = readln()
        if (Regex(pattern).matches(carName)) {
            break@w2
        } else {
            println("Enter valid model name....")
        }
    }
    w3@ while (true) {
        println("enter max speed")
        maxSpeed = readln().toInt()
        if (maxSpeed in 0..400) {
            break@w3
        } else {
            println("Max speed must between 0 to 400")
        }
    }
    w4@ while (true) {
        println("enter current speed")
        currentSpeed = readln().toInt()
        if (currentSpeed in 0..400) {
            break@w4
        } else {
            println("current speed must be in 0 to 400")
        }
    }

    CarList.list.add(Car(carName, modelName, maxSpeed, currentSpeed))
    println(CarList.list.last())
    println("Car Detail added successfully")
}