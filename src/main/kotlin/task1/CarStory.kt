package task1

//Task Date 31/07/2023
//Story code about nishit
//class and object
fun main() {

    val shop = Shop()
    val baleno1 = Baleno("baleno1")
    val baleno2 = Baleno("baleno2")

    val mayur = Person("mayur")
    mayur.buyCar(baleno2)
    val nishit = Person("nishit")
    nishit.buyCar(baleno2)

    val yug = Person("yug")

    yug.showAlloy(mayur.currentCar!!.alloy) {
        println(it)
    }

    shop.updateAlloy(mayur.currentCar!!)
    mayur.printCarDetail()
    yug.showAlloy(mayur.currentCar!!.alloy) {
        println(it)
    }

}