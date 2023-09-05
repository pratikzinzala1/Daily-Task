package temp


fun main() {

//    val s1 = StringOperation<String>("   Hello")
//
//    println(s1.string)

}



class StringOperation<T>(var string: T) {

    fun doubleString():String  {

        if (this.string is String){
            return "String is : ${this.string.toString().trim()}"
        }
        return ""
    }


}