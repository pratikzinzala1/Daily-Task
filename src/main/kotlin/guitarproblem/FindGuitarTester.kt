package guitarproblem

import guitarproblem.enums.Builderx
import guitarproblem.enums.Style
import guitarproblem.enums.Type
import guitarproblem.enums.Wood


fun main() {

    // Set up Rick’s guitar inventory
    val inventory = Inventory()
    initializeInventory(inventory)
    val whatErinLikes:InstrumentSpec = GuitarSpec(Builderx.FENDER, "abc", Type.ACOUSTIC,12, Wood.ALDER, Wood.CEDAR)
    val whatErinLikes2 = MandolinSpec(Builderx.FENDER, "abc", Style.F, Type.ACOUSTIC, Wood.ALDER, Wood.CEDAR)
    val matchingGuitars = inventory.search(whatErinLikes2)

    if (!matchingGuitars.isEmpty()) {
        val instrumentType = when(whatErinLikes){
          is GuitarSpec->"Guitar"
          else-> "Mandolin"
        }
        println("Erin, you might like these $instrumentType:")
        for (instrument in matchingGuitars) {
            val instrumentSpec = instrument.spec
            println(
                """ We have a ${instrumentSpec.builderx} ${instrumentSpec.model} ${instrumentSpec.type} 
                    $instrumentType: ${instrumentSpec.backWood} back and sides, ${instrumentSpec.topWood} top.
                    You can have it for only ${"$"}${instrument.price}!----"""
            )
        }
    } else {
        println("Sorry, Erin, we have nothing for you.")
    }
}

fun initializeInventory(inventory: Inventory) {

    inventory.addInstrument(
        "V95693", 1499.95, GuitarSpec(
            Builderx.FENDER, "Stratocastor",
            Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER
        )
    )

    inventory.addInstrument(
        "V95693", 1499.95, GuitarSpec(
            Builderx.FENDER, "Stratocastor",
            Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER
        )
    )

    inventory.addInstrument(
        "ZZZ",
        144.88,
        MandolinSpec(Builderx.FENDER, "abc", Style.F, Type.ACOUSTIC, Wood.ALDER, Wood.CEDAR)
    )


}
