package task7.rightangletriangle

fun main() {

    val char = "*"
    val number = 30
    var tempNumber = 0

    for (i in 1..number) {
        for (j in 1..i+tempNumber) {
            if (j == 1) {
                print(char)
            } else if (j == i+tempNumber || i == number) {
                print(char)
            }
            else {
                print("0")
            }
        }
        tempNumber++
        println()
    }

}
