package guitarproblem

import guitarproblem.enums.Builderx
import guitarproblem.enums.Type
import guitarproblem.enums.Wood

abstract class InstrumentSpec(
     open val builderx: Builderx, open val model: String, open val type: Type,open val backWood: Wood,open val topWood: Wood
) {




    open fun matches(otherSpec: InstrumentSpec): Boolean {
        if (builderx != otherSpec.builderx) return false
        if (model != null && model != "" && model != otherSpec.model) return false
        if (type != otherSpec.type) return false
        if (backWood != otherSpec.backWood) return false
        return if (topWood != otherSpec.topWood) false else true
    }
}