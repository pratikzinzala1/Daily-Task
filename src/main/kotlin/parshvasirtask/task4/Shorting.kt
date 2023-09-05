package parshvasirtask.task4

fun main(){

    val list:MutableList<Int> = mutableListOf()
    for (i in 0..100){
        list.add((1..100).random())
    }

    var largest = 0
    var secondlargest = 0

    for (i in list){
        if (i > largest){
            secondlargest = largest
            largest = i
        }
        else if (i > secondlargest){
            secondlargest = i
        }
    }
    println("Largest is $largest and second largest is $secondlargest")
}