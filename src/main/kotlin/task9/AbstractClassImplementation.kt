package task9

fun main(){

    val b1 = BoingPlan("B1")

    val r1 = RafelFighterJet("R1")

    b1.carryPeople()
    b1.fly()
    b1.land()

    r1.fly()
    r1.fightWithOtherPlan()
    r1.land()



}


class RafelFighterJet():Plan(){
    private lateinit var name:String
    constructor(name: String):this(){
        this.name = name
    }
    override fun fly() {
        println("$name Plan is Flying")
    }

    override fun land() {
        println("$name Plan is landing")
    }

    override fun reFillFuel() {
        println("$name Plan is Re fueling")
    }

    override fun carryPeople() {

    }

    override fun fightWithOtherPlan() {
        println("$name Plan is fighting with other plan")
    }

}

class BoingPlan:Plan{
    private var name:String
    constructor(name:String):super(){
        this.name = name
    }
    override fun fly() {
        println("$name Plan is Flying")
    }

    override fun land() {
        println("$name Plan is landing")
    }

    override fun reFillFuel() {
        println("$name Plan is Re fueling")
    }

    override fun carryPeople() {
        println("$name Plan carryingPeople")

    }

    override fun fightWithOtherPlan() {

    }

}

abstract class Plan{

    abstract fun fly()

    abstract fun land()

    abstract fun reFillFuel()

    abstract fun carryPeople()

    abstract fun fightWithOtherPlan()


}