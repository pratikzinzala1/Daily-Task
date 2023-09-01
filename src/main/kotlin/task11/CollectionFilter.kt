package task11

fun main() {


    val userList = ArrayList<User>()
    userList.add(User("Pratik", listOf(Follower("Hardik", false), Follower("Chirag", false))))
    userList.add(User("mitul", listOf(Follower("meet", true), Follower("anand", true))))
    userList.add(User("ashvin", listOf(Follower("parth", true), Follower("meet", false))))

    val filteredList = userList.filter {
        it.following.filter { follower ->
            !follower.isFollowedBack
        }.size == it.following.size
    }
    println(filteredList)

    val commonFriendList = userList.filter {
        it.following.any { follower ->
            follower.followerName == "meet"
        }
    }
    println(commonFriendList)

    userList.map {
//        it.name = "mitul"
        it.following.map { follower ->
            follower.isFollowedBack = false
        }
    }
    println(userList)

    val charList = ArrayList<Char>()
    charList.add(Char(listOf("A", "B", "C")))
    charList.add(Char(listOf("a", "b", "c")))

    val new = charList.flatMap {
        it.list
    }
    println(new)

    val newUserList = userList.flatMap {
        it.following.map {
            it.followerName
        }
    }
    println(newUserList)

    val filter1 = userList.filter { user ->
        user.following.filter {
            it.followerName.length >= 5
        }.size == user.following.size
    }
    println(filter1)


    //doubt here
    val colorList = listOf(
        Color("red", mutableListOf("red1", "red2", "red3", "red4", "red5")),
        Color("yellow", mutableListOf("yellow1", "yellow6", "yellow7", "yellow10", "yellow25")),
        Color("pink", mutableListOf("pink1", "pink2", "pink3", "pink4", "pink5")),
        Color("blue", mutableListOf("blue1", "blue4", "blue5", "blue18", "blue20")),
        Color("black", mutableListOf("black1", "black2", "black3", "black4", "black5")),
    )

    //I want output like Color("red",colorShade("red5")
    colorList.map {
        it.colorShade.last()
    }.also {
        println(it)
    }
//
//    colorList.filter {
//        it.colorShade.any {
//            it.contains("pink1")
//        }
//    }.also {
//        println(it)
//    }
//
//    colorList.map {
//        it.colorShade.filter {
//            it.contains("blue")
//        }
//    }.also {
//        println(it)
//    }
//
    callTest()


}

fun callTest() {
    //doubt here
    val colorList = listOf(
        Color("red", mutableListOf("red1", "red2", "red3", "red4", "red5")),
        Color("yellow", mutableListOf("yellow1", "yellow6", "yellow7", "yellow10", "yellow25")),
        Color("pink", mutableListOf("pink1", "pink2", "pink3", "pink4", "pink5")),
        Color("blue", mutableListOf("blue1", "blue4", "blue5", "blue18", "blue20")),
        Color("black", mutableListOf("black1", "black2", "black3", "black4", "black5")),
    )
    //problem
    val data: List<Color> = colorList.map {
        it.color = "null"
//       Color(it.color,it.colorShade)
//        Color("null", it.colorShade)
        it
    }

    data.apply {
        println(this)
    }



    colorList.map {
        it.colorShade = it.colorShade.map { it1 ->
            "NULL"
        } as MutableList<String>
        it
    }.also {
        println(it)
    }
    println(colorList)

}

data class Color(var color: String, var colorShade: MutableList<String>)

data class Char(val list: List<String>)
data class User(var name: String, val following: List<Follower>)
data class Follower(val followerName: String, var isFollowedBack: Boolean)
