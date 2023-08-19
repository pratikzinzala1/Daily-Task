package task7.triangle


fun main() {
    val lastChar = "$"
    val number = 20
    var tempNumber = number * 2-1

    for (i in 1..number) {
        for (x in 1..tempNumber) {
            if (x == i || i ==1 ) {
                print(lastChar)
            }else if (x == tempNumber){
                print(lastChar)
            }else if (x > i){
                print("0")
            }

            else{
                print(" ")
            }
        }
        println()
        tempNumber--
    }


}