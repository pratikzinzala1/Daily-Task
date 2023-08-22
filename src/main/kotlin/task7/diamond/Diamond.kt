package task7.diamond

fun main(){

    val lastChar = "&"
    val number = 21
    val midpoint = number/2 + 1

    var tempNumber = midpoint
    var tempMidpoint = midpoint

    for (i in 1..number) {
        if (i > midpoint){
            repeat(midpoint*2){
                print(" ")

            }
        }
        for (x in 1..tempNumber) {

            if (x == tempNumber || x == tempMidpoint) {
                print(lastChar)
            }else if (x < tempMidpoint){
                print(" ")
            }
            else {
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