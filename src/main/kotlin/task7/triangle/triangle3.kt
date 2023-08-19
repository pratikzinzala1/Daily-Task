package task7.triangle


fun main() {
    val char = "$"
    val number = 10
    val tempNumber = number * 2-1
    var pointer = 0

    for (i in 1..tempNumber) {
       print(char)
        repeat(pointer){
            print("0")
        }
        if (pointer>0){
            print(char)
        }
        if (i >= number){
            pointer--
        }
        else{
            pointer++
        }

        println()
    }


}