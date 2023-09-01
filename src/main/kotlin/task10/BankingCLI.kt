package task10


val arrayList: ArrayList<Holder> = ArrayList()
fun main() {

    bankApplicationUsingFunction()

}


fun bankApplicationUsingFunction(){
    println("Enter Your Choice : ")
    println("1 : Add User ")
    println("2 : List All User")
    println("Press Any Key To Exit")
    val userInput = readlnOrNull()?.toInt()
    when (userInput) {
        1 -> {
            println("Enter First Name : ")
            val firstName = readln()
            println("Enter Last Name : ")
            val lastName = readln()
            println("Enter Account Type")
            println("1 for saving ")
            println("2 for current ")
            val accountType = readln().toInt()
            println("Enter balance : ")
            val balance = readln().toInt()

            val holder = Holder(firstName, lastName, accountType, balance)
            arrayList.add(holder)
            println("Account Created ")
            println(arrayList.last())
            bankApplicationUsingFunction()
        }

        2 -> {
            println("List of All Account Holder : ")
            arrayList.forEach {
                println("***************************")
                println("FirstName : ${it.firstName}")
                println("LastName : ${it.lastName}")
                if (it.accountType == 1) {
                    println("Account Type : Saving")
                } else if (it.accountType == 2) {
                    println("Account Type : Current")
                }
                println("Current balance is : ${it.balance}")
                println("****************************")
            }
            bankApplicationUsingFunction()

        }
        else->{
            return
        }

    }
}


fun bankApplication() {
    while (true) {
        println("Enter Your Choice : ")
        println("1 : Add User ")
        println("2 : List All User")
        val userInput = readlnOrNull()?.toInt()
        when (userInput) {
            1 -> {
                println("Enter First Name : ")
                val firstName = readln()
                println("Enter Last Name : ")
                val lastName = readln()
                println("Enter Account Type")
                println("1 for saving ")
                println("2 for current ")
                val accountType = readln().toInt()
                println("Enter balance : ")
                val balance = readln().toInt()

                val holder = Holder(firstName, lastName, accountType, balance)
                arrayList.add(holder)
                println("Account Created ")
                println(arrayList.last())
            }

            2 -> {
                println("List of All Account Holder : ")
                arrayList.forEach {
                    println("***************************")
                    println("FirstName : ${it.firstName}")
                    println("LastName : ${it.lastName}")
                    if (it.accountType == 1) {
                        println("Account Type : Saving")
                    } else if (it.accountType == 2) {
                        println("Account Type : Current")
                    }
                    println("Current balance is : ${it.balance}")
                    println("****************************")

                }
            }
            else->{
                break
            }

        }


    }
}

data class Holder(val firstName: String, val lastName: String, val accountType: Int, val balance: Int)