package task3

import task1.Alloy
class Person(var name: String) {
    var currentCar: Car? = null
    private var personalKey:Int? = null

    fun setKey(key:Int){
        personalKey = key
    }

    fun insertKey():Int{
        return personalKey!!
    }
    fun buyCar(newCar: Car,callback: (String) -> Unit) {
        newCar.buyCar(7_00_000,PaymentMode.CARD)
        currentCar = newCar
        callback("$name has bought new car ${newCar.carName}")
    }

    fun showAlloy(alloy: Alloy, callback: (String) -> Unit) {
        if (alloy == Alloy.ALLOY1) {
            callback("${name} said I don't like this $alloy go and change it")

        } else {
            callback("This is fine")
        }
    }


}