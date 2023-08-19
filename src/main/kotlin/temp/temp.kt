package temp



fun main() {

   // val u = User("Zinzala")
    val x = Box(1,8.8)

    println(x.sumNumber())


}


class Box<A,B>(val a:A,val b:B) {

    fun sumNumber():Double{
        if (a is Number && b is Number){
            return a.toDouble()+b.toDouble()
        }
        return 0.0
    }

}

class User(surname:String){
    fun test(){

        {
            val test="jiii"
            println(test)
        }

        if(myVal==0){

            println()
        }

        val myVal =0
    }
    var name:String
    var myVal:Int = 0


    init {
        name = "Pratik"
        println(surname)

    }




}
