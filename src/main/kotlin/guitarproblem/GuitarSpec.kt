package guitarproblem

import guitarproblem.enums.Builderx
import guitarproblem.enums.Type
import guitarproblem.enums.Wood


class GuitarSpec(
    override val builderx: Builderx,
    override val model: String,
    override val type: Type,
    val numStrings: Int,
    override val backWood: Wood,
    override val topWood: Wood
) : InstrumentSpec(builderx, model, type, backWood, topWood) {

    override fun matches(otherSpec: InstrumentSpec): Boolean {
        if (!super.matches(otherSpec))
            return false
        if (otherSpec !is GuitarSpec)
            return false
        if (numStrings != otherSpec.numStrings)
            return false
        return true
    }
}
