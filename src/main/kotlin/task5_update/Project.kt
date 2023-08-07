package task5_update

class Project(
    private val projectName: String,
    private val constructorSite: String,
    val howManyPercentOfTaskDone: Int,
    val isProjectPending:Boolean
) {
    fun printProject() {
        println("Build $projectName at site $constructorSite this project is done by $howManyPercentOfTaskDone %")
        println()
    }
}