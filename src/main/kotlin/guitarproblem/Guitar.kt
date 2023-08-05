package guitarproblem

class Guitar(override val serialNumber: String,
             override var price: Double,
             override val spec: InstrumentSpec) :
    Instrument(serialNumber, price, spec)