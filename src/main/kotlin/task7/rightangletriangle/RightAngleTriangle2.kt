package task7.rightangletriangle

fun main() {

    val char = "*"
    val number = 10


    for (i in 1..number) {

        for (j in 1..number-i+1){
            if (j == 1 || i == 1 ){
                print(char)
            }
            else if(j == number-i+1){
                print(char)

            }
            else{
                print("0")
            }

        }
        println()
    }

}
