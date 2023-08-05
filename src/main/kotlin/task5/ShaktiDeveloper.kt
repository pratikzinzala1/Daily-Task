package task5

class ShaktiDeveloper: BuilderAbstracts() {
    override val builderName: String = "ShaktiDeveloper"
    override val doBuilderHaveLicence: Boolean = true
    override val builderFees: Int = 10_00_000
    override var realtyRatings: Int = 4

    init {
        addProject("OnePoint","KKV Hall,Rajkot",80,true)
        addProject("Vistara","150 Road,Ahmedabad",40,true)
        addProject("Engineering college","kankot,Rajkot",100,false)
        addProject("Green Mega mall","kaliyabid,Bhavnagar",25,true)
        addProject("Multi Complex","varacha,Surat",50,false)
        addReview("They are really good developer - umang savaliya")
        addReview("Best service with good quality - hardik zinzala")
        addReview("We bought house from Shakti Developer they are trully genuine - siddharth katariya")
    }

    override fun printPersonalDetails() {
        super.printPersonalDetails()
        println("Hello folks we are ShaktiDeveloper we develop home at low price and high standard fo quality")
    }



}