package task9


fun main(){

    val img = mutableListOf("*","*","*","n","*","*","*","n","*","*","*","n")
    val glide = Glide()
    glide.printImage(img)
    glide.changePixel("&",img)
    glide.printImage(img)


    val img2 = mutableListOf("*","*","*","n","*","*","*","n","*","*","*","n")
    val imageInterFace = object : ImageInterFace{
        override fun printImage(bitmap: List<String>) {
            bitmap.forEach {
                if (it == "n"){
                    println()
                }else{
                    print(" $it")
                }
            }
        }

        override fun changePixel(symbol: String, bitmap: MutableList<String>) {

            for (i in bitmap.indices){

                if (bitmap[i] != "n"){
                    bitmap[i] = symbol
                }

            }

        }
    }



    val picaso = Picaso(imageInterFace)
    picaso.imageInterFace.printImage(img2)
    picaso.imageInterFace.changePixel("$",img2)
    picaso.imageInterFace.printImage(img2)

    val img3 = mutableListOf("^","^","^","n","^","^","^","n","^","^","^","n")
    val picaso2 = Picaso(img3,imageInterFace)


}

class Picaso{
    var imageInterFace:ImageInterFace
    constructor(imageInterFace: ImageInterFace){
        this.imageInterFace = imageInterFace
    }

    constructor(img:List<String>,imageInterFace: ImageInterFace):this(imageInterFace){
        imageInterFace.printImage(img)
    }

}


class Glide:ImageInterFace{
    override fun printImage(bitmap: List<String>) {
        bitmap.forEach {
            if (it == "n"){
                println()
            }else{
                print(" $it")
            }
        }
    }

    override fun changePixel(symbol: String, bitmap: MutableList<String>) {

        for (i in bitmap.indices){

            if (bitmap[i] != "n"){
                bitmap[i] = symbol
            }

        }

    }


}

interface ImageInterFace{
    fun printImage(bitmap:List<String>)
    fun changePixel(symbol:String,bitmap: MutableList<String>)
}