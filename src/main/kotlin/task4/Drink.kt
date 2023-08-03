package task4

data class Drink(val drinkName:Drinks,val price:Int,val quantity:Int){

    fun printDrink(){

        println("*************************************************")
        println("Drink $drinkName Price $price Available $quantity")
        println("*************************************************")

    }

}
