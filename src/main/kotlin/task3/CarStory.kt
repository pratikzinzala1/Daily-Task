package task3

//Task Date 01/08/2023
//Polymorphism
fun main() {

    val baleno1 = Baleno("baleno1")
    baleno1.buyCar(700000,PaymentMode.CASH,100000)
    baleno1.setCarKey(123)

    val baleno2 = Baleno("baleno2")
    baleno2.buyCar(700000,PaymentMode.CARD)
    baleno2.setCarKey(234)


    baleno2.getDetails()


}