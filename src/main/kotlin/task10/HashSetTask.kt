package task10

fun main(){

    val setof  = mutableSetOf(0,1,2,3,4,5)
    val hashSet = HashSet<Int>()
    hashSet.add(1)
    hashSet.add(2)

    println(hashSet)

    for (i in 0..10){
        hashSet.add(i)
        setof.add(i)
    }
    println(setof)
    println(hashSet)



}