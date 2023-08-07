package temp


fun main() {

    val x: Int = 10
    val z: Int = (x as? Int) ?: 1
    println(z.plus(1))

}
