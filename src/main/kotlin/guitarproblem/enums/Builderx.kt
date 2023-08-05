package guitarproblem.enums

enum class Builderx {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    override fun toString(): String {
        return when (this) {
            FENDER -> "Fender"
            MARTIN -> "Martin"
            GIBSON -> "Gibson"
            COLLINGS -> "Collings"
            OLSON -> "Olson"
            RYAN -> "Ryan"
            PRS -> "Prs"
            ANY -> "Any"
            else -> "unspecified"
        }
    }
}