package task9

fun main(){

    val b1 = SBI("SBI1")

}


open class Bank {

    private var bankName:String = ""
    private var bankIfsc:Int = 0

    companion object{
        const val parentBank:String = "RBI"
    }

    constructor(){
        println("Bank Created under $parentBank Bank")
    }
    constructor(bankName: String):this(){
        this.bankName = bankName
        println("$bankName is created Under $parentBank")
    }
    constructor(bankName: String,ifsc: Int):this(){
        this.bankName = bankName
        this.bankIfsc = ifsc
        println("$bankName is created Under $parentBank with ifsc $ifsc")

    }



}

open class SBI: Bank {
    constructor():super(){
        println("SBI bank branch created")
    }
    constructor(name:String):super(name){
        println("$name is created")

    }

    constructor(name: String,ifsc:Int):super(name,ifsc){
        println("$name is created with ifsc $ifsc")
    }

    constructor(ifsc: Int):this(){
        println("$ifsc is created")
    }

}

