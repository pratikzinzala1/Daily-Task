package parshvasirtask.task2

fun main(){

    println(createCityCombination(listOf("Surat","Bhavnagar","Talaja","mahuva")))

}

fun createCityCombination(listOfCity:List<String>):List<Pair<String,String>>
{
    val combinationList:MutableList<Pair<String,String>> = mutableListOf()
    for (i in listOfCity){
        for (j in listOfCity){
            if (i == j) continue
            else if (combinationList.contains(Pair(j,i))) continue
            combinationList.add(Pair(i,j))
        }
    }
    return combinationList
}