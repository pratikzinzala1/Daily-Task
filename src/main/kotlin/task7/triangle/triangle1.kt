package task7.triangle


fun main() {
    val lastChar = "*"
    val number = 20
    var tempNumber = number

    for (i in 1..number) {
        val j = number - i + 1

        for (x in 1..tempNumber) {
            if (x == j || x == tempNumber) {
                    print(lastChar)
            } else if (i == number) {
                print(lastChar)
            }
            else if (x > j){
                print("0")
            }
            else {
                print(" ")
            }
        }
        println()
        tempNumber++
    }


}