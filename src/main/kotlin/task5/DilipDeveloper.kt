package task5

class DilipDeveloper:BuilderAbstracts() {
    override val builderName: String = "DelipDeveloper"
    override val doBuilderHaveLicence: Boolean = true
    override val builderFees: Int = 70_00_000
    override var realtyRatings: Int = 5

    init {
        addProject("OnePoint","KKV Hall,Rajkot",80,true)
        addProject("Vistara","150 Road,Ahmedabad",40,true)
        addProject("Engineering college","kankot,Rajkot",100,false)
        addProject("Green Mega mall","kaliyabid,Bhavnagar",25,true)
        addProject("Multi Complex","varacha,Surat",50,false)
        addReview("They are really good developer - umang savaliya")
        addReview("Best service with good quality - hardik zinzala")
    }
    override fun printPersonalDetails() {
        super.printPersonalDetails()
        println("We are government certified building developer")
    }
}