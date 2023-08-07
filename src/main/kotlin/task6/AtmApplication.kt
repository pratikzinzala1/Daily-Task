package task6

fun main(){
    val hdfcAtmMachine = AtmMachine(1234567890,25000,"HDFC BANK")
    hdfcAtmMachine.generateNewAtm("Pratik Zinzala",2001)
    val myAtmCard = AtmForUser("Pratik Zinzala",2001)
    hdfcAtmMachine.insertAtmCard(myAtmCard)
    hdfcAtmMachine.authentication()
    hdfcAtmMachine.withdrawMoney(220.2222)

}