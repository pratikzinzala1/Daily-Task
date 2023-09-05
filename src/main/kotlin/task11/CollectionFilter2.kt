package task11


fun main() {

    val playerList =
        listOf(
            Player("P1", mutableListOf("fast", "strong", "good")),
            Player("P2", mutableListOf("slow", "weak", "not bad")),
            Player("P3", mutableListOf("fast", "weak", "good"))
        )

    playerList.filter {
        it.skills.contains("weak")
    }.map {
        it.skills[it.skills.lastIndex] = "not bad"
        it
    }.filter {
        it.skills.contains("fast")
    }.also {
        println(it)
    }

    playerList.map {
        Player(it.name, it.skills.filter { it == "fast" } as MutableList<String>)
    }.also {
        println(it)
    }

    playerList.last {
        it == playerList.random()
    }.also {
        println(it)
    }

    playerList.chunked(1).also {
        println(it)
    }

}


data class Player(var name: String, val skills: MutableList<String>)



