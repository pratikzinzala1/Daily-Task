package temp


fun main(){

    val pattern = "[a-z]*[0-9]"
    val str = "ftdfa"

    println(Regex(pattern).matches(str))

}