package task3

//Task Date 03/08/2023
//Polymorphism
fun main() {

    val mihir = Person("mihir")
    val yug = Person("yug")


    val baleno1 = Baleno("baleno1")
    mihir.buyCar(baleno1){
        println(it)
        baleno1.setCarKey(123){key->
            mihir.setKey(key)
        }
    }

    println()

    val baleno2 = Baleno("baleno2")
    yug.buyCar(baleno2){
        println(it)
        baleno2.setCarKey(999){key->
            yug.setKey(key)
        }
    }

    println()

    with(baleno2){
        start(mihir.insertKey(),FuelType.CNG){
            if (it){driveCar()}
        }
        stop()
    }

    println()

    with(baleno1){
        stop()
    }

}