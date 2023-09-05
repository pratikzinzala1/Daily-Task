package test.task1


enum class SocietyType {
    FLAT, TENAMENT, BUNGALOW, DUPLEX;

    override fun toString(): String {
        return this.name.lowercase()
    }
}

data class Society(
    var buildingName: String,
    var buildingAddress: String,
    var societyType: SocietyType,
    var amenities: MutableList<String>,
    var nearbyPlaces: MutableList<String>,
)

fun main() {

    val societyList: MutableList<Society> = mutableListOf()
    while (true) {
        println("********** Society Maintenance System **********")
        println("1 : Add Society")
        println("2 : Display all Society")
        println("0 : To Quite Programme")
        println("Enter option you want : ")

        val selectedOption = readln().toIntOrNull()
        when (selectedOption) {
            0 -> {
                println("Exiting Programme")
                return
            }
            1 -> {
                addSociety(societyList)
            }
            2 -> {
                displaySociety(societyList)
            }
            else -> {
                println("Please Enter A Valid Number")
            }
        }
    }


}

fun addSociety(societyList: MutableList<Society>) {
    println("Enter Details As per Required")


    var name  = ""
    var address = ""
    var societyType: SocietyType = SocietyType.FLAT
    var amenities: MutableList<String> = mutableListOf()
    var nearbyPlaces: MutableList<String> = mutableListOf()
    enterName {
        name = it
    }
    enterAddress {
        address = it
    }
    enterBuildingType {
        societyType = it
    }
    enterAmenities {
        amenities = it
    }
    enterNearByPlace {
        nearbyPlaces = it
    }


    val society = Society(name, address, societyType, amenities, nearbyPlaces)
    printSociety(society)

    while (true) {
        println("Enter 1 To Confirm Detail")
        println("Enter 2 To Re Enter Detail")
        println("Enter 0 For Previous Menu")

        val enterChoice = readln().toIntOrNull()
        when (enterChoice) {
            0 -> {
                return
            }

            1 -> {
                societyList.add(society)
                println("Society Has Been Added")
                return
            }

            2 -> {
                updateSociety(society)
            }

            else -> {
                println("Please Enter Valid Number")
            }
        }

    }


}

fun enterName(callback: (String) -> Unit) {
    println("Enter Building Name : ")
    val name = readln()
    callback(name)
}

fun enterAddress(callback: (String) -> Unit) {
    println("Enter Building Address : ")
    val address = readln()
    callback(address)
}

fun enterBuildingType(callback: (SocietyType) -> Unit) {
    println("Enter Society Type : ")
    println("1 : for ${SocietyType.FLAT}")
    println("2 : for ${SocietyType.TENAMENT}")
    println("3 : for ${SocietyType.BUNGALOW}")
    println("4 : for ${SocietyType.DUPLEX}")
    println("0 : for previous menu")

    socityLoop@ while (true) {
        val userInputSocietyType = readln().toIntOrNull()
        when (userInputSocietyType) {
            0 -> {
                return
            }

            1 -> {
                callback(SocietyType.FLAT)
                break@socityLoop

            }

            2 -> {
                callback(SocietyType.TENAMENT)
                break@socityLoop

            }

            3 -> {
                callback(SocietyType.BUNGALOW)
                break@socityLoop

            }

            4 -> {
                callback(SocietyType.DUPLEX)
                break@socityLoop

            }

            else -> {
                println("Please Enter A Valid Number")
            }
        }
    }
}

fun enterAmenities(callback: (MutableList<String>) -> Unit) {
    println("Enter amenities list")
    val amenities: MutableList<String> = mutableListOf()

    amenitiesLoop@ while (true) {
        println("Enter amenities : ")
        println("Enter 1 for complete")
        println("Enter 0 for previous menu")

        val amenitie = readln()
        if (amenitie == "1") {
            break@amenitiesLoop
        } else if (amenitie == "0") {
            return
        } else {
            amenities.add(amenitie)
        }
    }
    callback(amenities)
}

fun enterNearByPlace(callback: (MutableList<String>) -> Unit) {
    println("Enter Nearby Place list")
    val nearbyPlaces: MutableList<String> = mutableListOf()
    nearbyPlacesLoop@ while (true) {
        println("Enter Nearby Place : ")
        println("Enter 1 for complete")
        println("Enter 0 for previous menu")

        val nearbyPlace = readln()
        if (nearbyPlace == "1") {
            break@nearbyPlacesLoop
        } else if (nearbyPlace == "0") {
            return
        } else {
            nearbyPlaces.add(nearbyPlace)
        }
    }
    callback(nearbyPlaces)
}

fun updateSociety(society: Society) {
    println("Select Option You Want To  Update")
    println("1 : Update Name ")
    println("2 : Update Address ")
    println("3 : Update Building Type ")
    println("4 : Update Amenities")
    println("5 : Update NearByPlace")
    updateLoop@ while (true) {
        val selectedOption = readln().toIntOrNull()
        println("Enter Option You Want To  Update")
        println("Enter 0 For Previous Menu")

        when (selectedOption) {
            0->{
                break@updateLoop
            }
            1 -> {
                enterName {
                    society.buildingName = it
                }
                break@updateLoop
            }

            2 -> {
                enterAddress {
                    society.buildingAddress = it
                }
                break@updateLoop

            }

            3 -> {
                enterBuildingType {
                    society.societyType = it
                }
                break@updateLoop
            }

            4 -> {
                enterAmenities {
                    society.amenities = it
                }
                break@updateLoop

            }

            5 -> {
                enterNearByPlace {
                    society.nearbyPlaces = it
                }
                break@updateLoop

            }

            else -> {
                println("Please Enter Valid Number")

            }
        }



    }

}


fun displaySociety(societyList: MutableList<Society>) {
    println("All Society List are : ")
    societyList.forEach {
        printSociety(it)
    }
    return
}

fun printSociety(society: Society) {
    println("****************************************")
    println("Society Details Are :")
    println("Building Name : ${society.buildingName}")
    println("Building Address Name : ${society.buildingAddress}")
    println("Building SocietyType Name : ${society.societyType}")
    println("Building Amenities List are  : ")
    society.amenities.forEach {
        print("$it ,")

    }
    println()

    println("Buildings Nearby Places : ")
    society.nearbyPlaces.forEach {
        print("$it ,")
    }
    println()

    println("****************************************")


}