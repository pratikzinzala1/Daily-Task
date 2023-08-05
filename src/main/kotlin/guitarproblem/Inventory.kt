package guitarproblem

class Inventory {
     private val inventory: MutableList<Instrument> = mutableListOf()

    fun addInstrument(
        serialNumber: String, price: Double, instrumentSpec: InstrumentSpec
    ) {
        var instrument: Instrument? = null
        if (instrumentSpec is GuitarSpec) {
            instrument = Guitar(serialNumber, price, instrumentSpec)
        } else if (instrumentSpec is MandolinSpec) {
            instrument = Mandolin(serialNumber, price, instrumentSpec)
        }
        inventory.add(instrument!!)
    }

    //    fun getInstrument(serialNumber: String): Guitar? {
//        for (guitar in Instrument) {
//            if (guitar.serialNumber == serialNumber) {
//                return guitar
//            }
//        }
//        return null
//    }
    fun get(serialNumber: String): Instrument? {

        for (instrument in inventory) {
            if (instrument.serialNumber == serialNumber) {
                return instrument
            }
        }
        return null
    }

    fun search(searchSpec: InstrumentSpec): List<Instrument> {
        val matchingInstrument: MutableList<Instrument> = mutableListOf()
        for (instrument in inventory) {
            if (instrument.spec.matches(searchSpec)) matchingInstrument.add(instrument)
        }
        return matchingInstrument
    }
}