package task10

fun main() {


    val hashMap = HashMap<Int, String>()
    hashMap[1] = "One"
    hashMap[2] = "Two"
    hashMap[2] = "TWO"

    println(hashMap)
    for (i in 0..5) {
        hashMap[i] = "Number : $i"
    }

    println(hashMap)


    hashMap.remove(2)

    println(hashMap)
    for (i in hashMap.keys){
        hashMap[i]  = "NULL"

    }
    println(hashMap)




}