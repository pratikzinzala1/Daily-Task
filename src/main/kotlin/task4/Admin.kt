package task4


data class Collection(val drinks: Drinks, private var collectedAmount: Int) {

    fun updateCollection(amount: Int) {
        collectedAmount += amount
    }
    fun getCollection():Int{
        return collectedAmount
    }
    fun printCollection(){
        println("collection for ${drinks.drinkName} =  $collectedAmount")
    }
}

class Admin() {
    val collectionList: List<Collection> = listOf(
        Collection(Drinks.COCK, 0),
        Collection(Drinks.ORANGE, 0),
        Collection(Drinks.THUMPS_UP, 0)
    )

    fun printCollection(){
        var sum = 0
        collectionList.forEach {
            it.printCollection()
            sum += it.getCollection()
        }
        println("Total collected amount : $sum")
    }


}