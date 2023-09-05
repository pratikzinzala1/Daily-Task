package test.task2


fun main(){

    val parth = Human("Parth")
    performOperationOnHuman(parth)

}

fun performOperationOnHuman(human: Human){

    while (true){
        println("Select Option ")
        println("1 for Eat")
        println("2 for Drink")
        println("3 for Shelter")
        println("4 for Take-Bath")
        println("5 for playGame")
        println("6 for Watch Tv")
        println("7 for Visit Park")
        println("8 for Drive Car")
        println("Enter 0 for Exit")
        println("Enter Your Option : ")
        val selectedOption = readln().toIntOrNull()
        when(selectedOption){
            0->{
                break
            }
            1->{
                human.eat("Apple")
            }
            2->{
                human.drink("Water")
            }
            3->{
                human.shelter()
            }
            4->{
                human.cleanBody("Shower")
            }
            5->{
                human.playGame("Football")
            }
            6->{
                human.watchTv("The Office")
            }
            7->{
                human.visitPark("Main Park")
            }
            8->{
                human.driveVehicle("Car")
            }
        }
    }
}


class Human(var name:String):HumanNeedActivity{

    var energyLevel:Double = 0.0
    override fun eat(food: String) {
        energyLevel += 1.0
        println("$name is eating $food")
    }

    override fun drink(drink: String) {
        energyLevel += 0.5
        println("$name is drinking $drink")
    }

    override fun shelter() {
        if (energyLevel>0){
            println("$name is taking shelter")
            energyLevel -= 0.5
        }
        else{
            println("Energy Level Low Need Food")
        }
    }

    override fun cleanBody(bathType: String) {

        if (energyLevel>0){
            println("$name is taking $bathType")
            energyLevel -= 0.2
        }
        else{
            println("Energy Level Low Need Food")
        }
    }

    override fun playGame(game: String) {
        if (energyLevel>0){
            println("$name is playing $game")
            energyLevel -= 0.5
        }
        else{
            println("Energy Level Low Need Food")
        }
    }

    override fun watchTv(show: String) {
        if (energyLevel>0){
            println("$name is watching $show")
            energyLevel -= 0.2
        }
        else{
            println("Energy Level Low Need Food")
        }
    }

    override fun visitPark(part: String) {
        if (energyLevel>0){
            println("$name is visiting $part")
            energyLevel -= 0.5
        }
        else{
            println("Energy Level Low Need Food")
        }
    }

    override fun driveVehicle(vehicles: String) {
        if (energyLevel>0){
            println("$name is driving $vehicles")
            energyLevel -= 0.5
        }
        else{
            println("Energy Level Low Need Food")
        }
    }


}


interface HumanExtraActivity{
    fun playGame(game:String)
    fun watchTv(show:String)
    fun visitPark(part:String)
    fun driveVehicle(vehicles: String)

}
interface HumanNeedActivity:HumanExtraActivity{
    fun eat(food:String)
    fun drink(drink:String)
    fun shelter()
    fun cleanBody(bathType:String)
}