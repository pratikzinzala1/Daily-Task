package guitarproblem.enums

enum class Type {
    ACOUSTIC, ELECTRIC;

    override fun toString(): String {
        return when (this) {
            ACOUSTIC -> "acoustic"
            ELECTRIC -> "electric"
            else -> "unspecified"
        }
    }
}