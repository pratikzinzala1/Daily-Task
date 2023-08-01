package parshvasirtask

import java.lang.Exception
import java.lang.IllegalArgumentException


object GenerateUID {
    private val oldUid = mutableListOf<Int>()
    fun UID(): Int {
        val random = (1..1000).random()

        if (oldUid.contains(random)) {
            return UID()
        } else {
            oldUid.add(random)
            return random
        }
    }
}

fun main() {

    val carList: MutableList<Car> = mutableListOf()
    carList.add(Car("a","a",100,20))
    carList.add(Car("b","b",100,20))
    carList.add(Car("b","b",100,20))
    for(i in 0..500){
        val m = ('a'..'z').random()
        carList.add(Car(m.toString(),m.toString(),i,i))

    }

    while (true) {
        println("-----------------------------------------------------------------")
        println("Please Enter Your Choice")
        println("1 for view car list")
        println("2 for search car or car operation")
        println("3 for adding car")
        println("-----------------------------------------------------------------")
        try {
            val input1 = readln().toInt()
            when (input1) {
                1 -> showCar(carList)
                2 -> searchCar(carList)
                3 -> addCar(carList)
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

fun searchCar(carList: MutableList<Car>) {

    if (carList.isEmpty()) {
        println("No cars are available")
        return
    }

    val searchResult = mutableListOf<Int>()
    var selectedCar: Int? = null
    println("Please enter car name......")
    println("enter 0 for main menu......")
    val carName = readln()
    if (carName == "0") return
    for (i in carList.indices){

        if (carList[i].carName == carName) {
            searchResult.add(i)
        }

    }
    if (searchResult.isEmpty()){
        println("car does not exist")
        return
    }
    if (searchResult.size > 1) {
        println("please select car from given list")
        for(i in searchResult){
            println("********************************************")
            println(
                " Car ID : ${carList[i].carId} " +
                        "\n Car Name : ${carList[i].carName}" +
                        "\n Model Name : ${carList[i].modelName} " +
                        "\n Max Speed : ${carList[i].maxSpeed} " +
                        "\n Current Speed : ${carList[i].currentSpeed}"
            )
            println("********************************************")

        }


        while (selectedCar == null){
            println("enter car id.....")
            println("enter 0 for main menu")
            val carId = readln().toInt()

            if (carId == 0) return
            for (i in searchResult){
                if (carList[i].carId == carId) {
                    selectedCar = i
                    break
                }

            }
            println("Enter valid Car id")

        }


    }
    else{
        selectedCar = searchResult[0]
    }
    println("Your Selected Car is \n ${carList[selectedCar]}")
    performOperation(carList[selectedCar])

}

fun performOperation(selectedCar:Car) {


    while (true){
        println("Select Operation to perform")
        println("1 for stop car")
        println("2 for break car")
        println("3 for increase speed")
        println("0 for main menu")
        val choice = readln().toInt()
        when(choice){
            0 -> return
            1 -> selectedCar.stopCar()
            2 ->{
                println("Current speed is ${selectedCar.currentSpeed}")
                println("Enter speed you want to increase")
                val speedAddOn = readln().toInt()
                selectedCar.breakCar(speedAddOn)
                println("Current speed is ${selectedCar.currentSpeed}")
            }
            3->{
                println("Current speed is ${selectedCar.currentSpeed}")
                println("Enter speed you want to decrease")
                val speedSubOn = readln().toInt()
                selectedCar.updateSpeed(speedSubOn)
                println("Current speed is ${selectedCar.currentSpeed}")
            }
            else->{
                continue
            }
        }

    }



}


fun showCar(carList: MutableList<Car>) {

    println("Here is the list of all available car")
    carList.forEach {
        println("********************************************")
        println(
            " Car ID : ${it.carId} " +
                    "\n Car Name : ${it.carName}" +
                    "\n Model Name : ${it.modelName} " +
                    "\n Max Speed : ${it.maxSpeed} " +
                    "\n Current Speed : ${it.currentSpeed}"
        )
        println("********************************************")
    }

}


fun addCar(carList: MutableList<Car>) {
    println("please enter your car detail")
    println("enter car name")
    val carName = readln()
    println("enter model name")
    val modelName = readln()
    println("enter max speed")
    val maxSpeed = readln().toInt()
    println("enter current speed")
    val currentSpeed = readln().toInt()

    carList.add(Car(carName, modelName, maxSpeed, currentSpeed))
    println(carList.last())
    println("Car Detail added successfully")
}