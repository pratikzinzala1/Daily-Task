package task12

import kotlinx.coroutines.*

fun main() {

//    printGivenString("HELLO.txt") {
//        println(it.lowercase())
//        println("Download Completed")
//    }

    val sumTowNumber:(Int,Int)->String = {first,second->
        val sum = first + second
        sum.toString()
    }

    println(sumTowNumber(1,2))

    printTotalBillNumber(::sumBill)


    one{a:Int,b:Int->
        a+b
    }.also {
        println(it)
    }

    val noArgLambda = { println("This is no argument lambda") }
    noArgLambda()



    val multiply:(Int,Int)->Int ={a:Int,b:Int->
        a*b
    }

    println(multiply(2,2))

}





fun one(two:(Int,Int)->Int): Int {

    return three(two(1,1),two(1,1))

}

fun three(a:Int,b:Int):Int{
    return a+b
}



fun printTotalBillNumber(function: (first:Int,second: Int) -> Int) {
    println(function(4,5))

}

fun sumBill(first:Int,second:Int): Int {
    val sum = first +second
    return sum
}

fun printGivenString(str: String, printString: (String) -> Unit) {

    val job = CoroutineScope(Dispatchers.Default).launch {
        println("Downloading Started")
        delay(3000)
    }

    runBlocking {
        job.join()
        printString("FILE : $str is downloaded")
    }


}