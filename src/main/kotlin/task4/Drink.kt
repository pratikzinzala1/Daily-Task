package task4

data class Drink(val drinkName:Drinks,val price:Int,var quantity:Int){

    fun printDrink(index:Int){

        println("$index for Drink ${drinkName.drinkName} Price $price Available $quantity")

    }
    fun updateDrink(amount:Int,callBack:(Int)->Unit){
        if (amount<price){
            println("insufficient amount")
            callBack(amount)
        }
        else if(quantity <= 0 ){
            println("sorry ${drinkName.drinkName} is not available")
            callBack(amount)
        }
        else {
            println("Here is your drink ${drinkName.drinkName}")
            quantity--
            callBack(amount-price)
        }

    }

}
