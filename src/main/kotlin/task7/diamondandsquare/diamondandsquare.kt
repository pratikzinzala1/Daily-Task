package task7.diamondandsquare

fun main(){

    val char = "&"
    val char2 = "$"

    val number = 11
    val midpoint = number/2 + 1

    var tempNumber = midpoint
    var tempMidpoint = midpoint

    for (i in 1..number) {
        for (x in 1..number) {
            if (x == tempNumber || x == tempMidpoint) {
                print(char)
            }else if (x < tempMidpoint || x > tempNumber){
                print(" ")
            }
            else {
                print("0")
            }
        }
        for (y in 1..number){
            if (y==1 || y == number || i == 1 || i==number){
                print(char2)
            }
            else{
                print("0")
            }

        }
        println()
        if (i >= midpoint){
            tempNumber--
            tempMidpoint++
        }
        else{
            tempNumber++
            tempMidpoint--
        }
    }


}