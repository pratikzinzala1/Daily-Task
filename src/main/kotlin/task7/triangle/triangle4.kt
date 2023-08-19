package task7.triangle


fun main() {
    val char = "$"
    val number = 10
    val tempNumber = number * 2-1
    var pointer = number

    for (i in 1..tempNumber) {
        for (j in 1..number){
            if (j == number){
                print(char)

            }
            else if (j == pointer){
                print(char)

            }
            else if (j > pointer){
                print("0")
            }
            else{
                print(" ")

            }
        }
        if (i >= number){
            pointer++
        }
        else{
            pointer--
        }
        println()
    }


}