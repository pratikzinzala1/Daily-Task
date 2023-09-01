package task8

fun main() {

    val b = ATM()
    println(Bank.parentBank)

}

abstract class Bank() {

    companion object {
        const val parentBank: String = "RBI"
    }

    init {
        println("Bank initiated")
    }

    var bankName: String? = null

    constructor(name: String) : this() {
        this.bankName = name
        println("Bank secondary called $name")
    }

}

open class SBI() : Bank() {
    init {
        println("SBI initiated")
    }


    constructor(name: String) : this() {
        println("Primary SBI called")
    }

    constructor(atmNumber: Int, name: String) : this() {
        println("$atmNumber is created")
    }


}


class ATM() : SBI() {
    init {
        println("ATM initiated")
    }


    //    constructor(name:String){
//        println("$name atm is created")
//    }
//
    constructor(atmNumber: Int, name: String) : this() {
        println("Primary ATM called")
    }
//
//    constructor(atmNumber: Double,name: String){
//        println("$atmNumber ATM called")
//    }

}