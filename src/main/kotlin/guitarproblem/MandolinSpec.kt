package guitarproblem

import guitarproblem.enums.Builderx
import guitarproblem.enums.Type
import guitarproblem.enums.Wood


class MandolinSpec(
    override val builderx: Builderx,
    override  val model: String,
    val style: guitarproblem.enums.Style,
    override  val type: Type,
    override  val backWood: Wood,
    override  val topWood: Wood
) : InstrumentSpec(
    builderx, model, type,
    backWood,
    topWood,
) {
    override fun matches(otherSpec: InstrumentSpec): Boolean {
        if (!super.matches(otherSpec))
            return false
        if (!(otherSpec is MandolinSpec))
            return false
        if (style != otherSpec.style)
            return false
        return true
    }

}
