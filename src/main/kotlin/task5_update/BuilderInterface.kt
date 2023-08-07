package task5_update

interface BuilderInterface {


    val builderName: String
    val doBuilderHaveLicence: Boolean
    val builderFees: Int
    var realtyRatings: Int


    fun printReviews()

    fun printPersonalDetails()

    fun addReview(review: String)

    fun addReview(list: List<String>)

    fun printListOfProjectDone()

    fun printListOfProjectDone(percentageDone: Int)

    fun printListOfProjectDone(isPending: Boolean)

    fun addProject(
        projectName: String,
        constructorSite: String,
        howManyPercentOfTaskDone: Int,
        isPending: Boolean
    )

    fun addProject(
        projectList: List<Project>
    )

}