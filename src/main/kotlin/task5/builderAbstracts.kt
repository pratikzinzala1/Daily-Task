package task5


abstract class BuilderAbstracts {
    protected abstract val builderName: String
    protected abstract val doBuilderHaveLicence: Boolean
    protected abstract val builderFees: Int
    protected abstract var realtyRatings: Int

    private val listOfReview: MutableList<String> = mutableListOf()
    private var listOfProjectDoneByBuilder: MutableList<Project> = mutableListOf()

    fun printReviews() {
        println("Reviews are : ")
        listOfReview.forEach {
            println("\" $it \"")
        }
        println()
    }


    open fun printPersonalDetails() {
        println()
        println("Builder name $builderName do have licence ${if (doBuilderHaveLicence) "yes" else "no"}")
        println("$builderName is $realtyRatings rated from client")
        println("$builderName fees $builderFees per project they have done ${listOfProjectDoneByBuilder.size} project")
        println()
    }

    fun addReview(review: String) {
        listOfReview.add(review)
    }

    fun printListOfProjectDone() {
        println("List of Project :")
        listOfProjectDoneByBuilder.forEach {
            it.printProject()
        }
        println()
    }

    fun printListOfProjectDone(percentageDone: Int) {
        println("List of Project done by $percentageDone:")
        listOfProjectDoneByBuilder.forEach {
            if (it.howManyPercentOfTaskDone >= percentageDone) {
                it.printProject()
            }
        }
        println()
    }

    fun printListOfProjectDone(isPending: Boolean) {
        println("List of project ${if (isPending) "done" else "pending"}")
        listOfProjectDoneByBuilder.forEach {
            if (it.isProjectPending == isPending){
                it.printProject()
            }
        }
        println()
    }

    protected fun addProject(
        projectName: String,
        constructorSite: String,
        howManyPercentOfTaskDone: Int,
        isPending: Boolean
    ) {
        listOfProjectDoneByBuilder.add(Project(projectName, constructorSite, howManyPercentOfTaskDone,isPending))
    }

}