package task10

fun main(){

    val arrayList1:ArrayList<Int> = arrayListOf()
    val arrayList2:ArrayList<Int> = arrayListOf()

    repeat(100){
        arrayList1.add((1..50).random())
    }

    arrayList2.addAll(arrayList1)

    println(arrayList2.contains(33))
    println(arrayList2.lastIndexOf(10))
    arrayList2.sort()
    arrayList2.retainAll {
        it<10
    }
    println(arrayList2)


    val hashMap = HashMap<Int,Int>()
    for (i in 0..5){
        hashMap[i] = i+10
    }

    hashMap.forEach{
        println("${it.hashCode()} And ${it.value}")
    }


}