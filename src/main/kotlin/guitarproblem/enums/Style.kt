package guitarproblem.enums

enum class Style {
    A, F;
    override fun toString(): String {
        return when (this){
            A->"A"
            F->"F"
        }
    }
}