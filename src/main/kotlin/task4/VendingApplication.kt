package task4


//Task Date 03/08/2023
//Task on building own oop base programme


fun main() {

    val vendingMachine: VendingInterface = VendingMachine()
    vendingMachine.initializeMachine()


    inputLoop(true) {
        println(vendingMachine.machineCompany)
        println("Please select option")
        println("1 for enter money")
        println("2 for enter money and apply coupon")
        println("3 for admin task")
        when (readln().toInt()) {
            1 -> {
                inputLoop(false) {
                    println("Enter Your amount")
                    vendingMachine.insertMoney(readln().toInt())
                }
                listOutDrinks(vendingMachine)
            }

            2 -> {
                println("Enter Your amount")
                val amount = readln().toInt()
                println("Enter your coupon code")
                vendingMachine.insertMoney(amount, readln().toInt())
                println("Your new amount is ${vendingMachine.insertedAmount}")
                listOutDrinks(vendingMachine)
            }
            3->{
                vendingMachine.getAdminData()
            }
            else -> {
                throw IllegalArgumentException("")
            }
        }


    }

}

fun listOutDrinks(vendingMachine:VendingInterface){
    vendingMachine.listDrink()
    inputLoop(false) {
        println("Please select your drink ")
        val selectedOption = readln().toInt()
        if (selectedOption in 0..2) {
            vendingMachine.selectProduct(selectedOption)
            vendingMachine.buyDrink()
        } else {
            throw IllegalArgumentException("")
        }


    }

}


fun inputLoop(runInfiniteTime: Boolean, looper: () -> Unit) {
    if (runInfiniteTime) {
        while (true) {
            try {
                looper()
            } catch (e: Exception) {
                println("Please enter valid number")
            }
        }
    } else {
        while (true) {
            try {
                looper()
                break
            } catch (e: Exception) {
                println("Please enter valid number")
            }
        }
    }

}