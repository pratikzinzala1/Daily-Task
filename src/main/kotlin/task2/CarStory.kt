package task2

//Task Date 02/08/2023
//Polymorphism
fun main() {

    val baleno1 = Baleno("baleno1")
    baleno1.engineNumber = 123
    baleno1.setPayment(700000,PaymentMode.CASH,100000)

    val baleno2 = Baleno("baleno2")
    baleno2.engineNumber = 456
    baleno2.setPayment(700000,PaymentMode.CARD)

    baleno2.start(true)
    baleno1.start(true,true)
    println(baleno2.vehiclePrice)

    baleno2.getDetails()


}