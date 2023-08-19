package temp


lateinit var x:String
fun main(){


    //println(z)


}

class Demo{

    val a = "hello"
    val b = "hii"

    private val z by lazy { a+b }

    fun printValue(){
        println(z)
    }

}