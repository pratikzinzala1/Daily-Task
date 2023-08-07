package task5_update


class Builder(
    override val builderName: String,
    override val doBuilderHaveLicence: Boolean,
    override val builderFees: Int,
    override var realtyRatings: Int,
) : BuilderInterface {

    private val listOfReview: MutableList<String> = mutableListOf()
    private val listOfProjectDoneByBuilder: MutableList<Project> = mutableListOf()
    override fun printReviews() {
        println("Reviews are : ")
        listOfReview.forEach {
            println("\" $it \"")
        }
        println()
    }


    override fun printPersonalDetails() {
        println()
        println("Builder name $builderName do have licence ${if (doBuilderHaveLicence) "yes" else "no"}")
        println("$builderName is $realtyRatings rated from client")
        println("$builderName fees $builderFees per project they have done ${listOfProjectDoneByBuilder.size} project")
        println()
    }

    override fun addReview(review: String) {
        listOfReview.add(review)
    }

    override fun addReview(list: List<String>) {
        listOfReview.addAll(list)
    }

    override fun printListOfProjectDone() {
        println("List of Project :")
        listOfProjectDoneByBuilder.forEach {
            it.printProject()
        }
        println()
    }

    override fun printListOfProjectDone(percentageDone: Int) {
        println("List of Project done by $percentageDone %:")
        listOfProjectDoneByBuilder.forEach {
            if (it.howManyPercentOfTaskDone >= percentageDone) {
                it.printProject()
            }
        }
        println()
    }

    override fun printListOfProjectDone(isPending: Boolean) {
        println("List of project ${if (isPending) "done" else "pending"}")
        listOfProjectDoneByBuilder.forEach {
            if (it.isProjectPending == isPending) {
                it.printProject()
            }
        }
        println()
    }

    override fun addProject(
        projectName: String,
        constructorSite: String,
        howManyPercentOfTaskDone: Int,
        isPending: Boolean
    ) {
        listOfProjectDoneByBuilder.add(Project(projectName, constructorSite, howManyPercentOfTaskDone, isPending))
    }

    override fun addProject(projectList: List<Project>) {
        listOfProjectDoneByBuilder.addAll(projectList)
    }

}