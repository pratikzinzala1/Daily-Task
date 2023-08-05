package guitarproblem.enums

enum class Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    override fun toString(): String {
        return when (this) {
            INDIAN_ROSEWOOD -> "Indian Rosewood"
            BRAZILIAN_ROSEWOOD -> "Brazilian Rosewood"
            MAHOGANY -> "Mahogany"
            MAPLE -> "Maple"
            COCOBOLO -> "Cocobolo"
            CEDAR -> "Cedar"
            ADIRONDACK -> "Adirondack"
            ALDER -> "Alder"
            SITKA -> "Sitka"
            else -> "unspecified"
        }
    }
}