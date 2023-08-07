package guitarproblem

import guitarproblem.enums.Builderx
import guitarproblem.enums.Type
import guitarproblem.enums.Wood

fun main(){

    val shopList:MutableList<Shop> = mutableListOf()
    shopList.add(Shop(Inventory()))
    shopList.add(Shop(Inventory()))
    shopList.add(Shop(Inventory()))


    val whatErinLikes = GuitarSpec(
        Builderx.FENDER,
        "Stratocastor", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER
    )

    val matchingGuitars = shopList[0].inventory.search(whatErinLikes)
    if (!matchingGuitars.isEmpty()) {
        println("Erin, you might like these guitars:")
        for (instrument in matchingGuitars) {
            val instrumentSpec = instrument.spec
            println(
                """ We have a ${instrumentSpec.builderx} ${instrumentSpec.model} ${instrumentSpec.type} 
                    guitar: ${instrumentSpec.backWood} back and sides, ${instrumentSpec.topWood} top.
                    You can have it for only ${"$"}${instrument.price}!----"""
            )
        }
    } else {
        println("Sorry, Erin, we have nothing for you.")
    }



}