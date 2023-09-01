package task10

import java.util.ArrayList


fun main(){

    val arrayList:ArrayList<Int> = ArrayList()

    arrayList.add(1)
    arrayList.add(2)

    for (i in 3..10){
        arrayList.add(i)
    }
    for (i in 3..10){
        arrayList.add(i)
    }
    arrayList.sort()
    arrayList[3] = 99


    println(arrayList)

    for (i in arrayList.indices){
        if (arrayList[i] == 99){
            arrayList[i] = 4
        }
    }

    arrayList.remove(10)
    println(arrayList)



}