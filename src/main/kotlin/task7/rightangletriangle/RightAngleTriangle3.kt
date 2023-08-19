package task7.rightangletriangle

fun main() {

    val char = "*"
    val number = 11

    for (i in 1..number) {

        for (j in 1..number) {
            if (j == number || i == 1) {
                print(char)
            } else if(i == j){
                print(char)
            }
            else if (i < j){
                print("0")

            }
            else{
                print(" ")

            }

        }
        println()
    }

}
