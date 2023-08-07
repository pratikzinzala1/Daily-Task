package task5_update

enum class HouseType {
    TENEMENT, ROW_HOUSE, APARTMENT;

    override fun toString(): String {
        return when (this) {
            TENEMENT -> "Tenament"
            ROW_HOUSE -> "Row-House"
            APARTMENT -> "Apartment"
        }
    }
}