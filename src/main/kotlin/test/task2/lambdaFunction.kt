package test.task2

fun main(){

    add(1.0,2.0){
        println(it)
    }
    minus(10.0,5.0){
        println(it)
    }
    multiply(3.0,3.0){
        println(it)
    }
    divide(8.0,2.0){
        println(it)
    }


}


fun add(a:Double,b:Double,callback:(Double)->Unit){
    callback(a+b)
}
fun minus(a:Double,b:Double,callback:(Double)->Unit){
    callback(a-b)
}
fun multiply(a:Double,b:Double,callback:(Double)->Unit){
    callback(a*b)
}
fun divide(a:Double,b:Double,callback:(Double)->Unit){
    callback(a/b)
}


