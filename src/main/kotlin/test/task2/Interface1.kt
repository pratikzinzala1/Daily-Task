package test.task2

fun main(){

    val t = Triangle(3.0,7.0)
    println(t.calculateArea())
    val s = Square(4.0)
    println(s.calculateArea())
    val r = Rectangle(2.0,3.0)
    println(r.calculateArea())

}

class Triangle(private val base:Double,private val height: Double):Shape{
    override fun calculateArea(): Double {
        return (base*height)/2
    }

}
class Square(private val width: Double):Shape{
    override fun calculateArea(): Double {
        return width*width
    }

}
class Rectangle(private val width:Double,private val height:Double):Shape{
    override fun calculateArea():Double{
        return width*height
    }
}

interface Shape{
    fun calculateArea():Double
}