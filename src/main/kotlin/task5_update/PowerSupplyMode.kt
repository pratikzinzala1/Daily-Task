package task5_update

enum class PowerSupplyMode {
    SOLAR, METER_CONNECTION, NO_SUPPLY;

    fun printSupply(buildingName:String) {
        println()
        when (this) {
            SOLAR -> println("$buildingName Power supply started with solar")
            METER_CONNECTION -> println("$buildingName Power supply started with Meter connection")
            NO_SUPPLY -> println("$buildingName Power supply stopped")
        }
        println()
    }

}