package task9

fun main() {

    val f32 = F32("F32 Rapter")
    val airbus = AirBus("Air 90")

    f32.carryMissile()
    f32.fly()
    f32.fightWithOtherPlan()
    f32.land()


    airbus.carryPeople()
    airbus.fly()
    airbus.provideServiceToPeople()
    airbus.land()

}


class F32 : FighterPlan, PlanInterFace {
    private var name: String

    constructor(name: String) : super() {
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


    override fun fightWithOtherPlan() {
        println("$name Plan is fighting with other plan")
    }

    override fun carryMissile() {
        println("$name Plan is carrying missile")

    }

}

class AirBus : CommercialPlan, PlanInterFace {
    private var name: String

    constructor(name: String) : super() {
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

    override fun provideServiceToPeople() {
        println("$name Plan is providing service to people")

    }

    override fun carryPeople() {
        println("$name Plan carryingPeople")

    }


}

abstract class FighterPlan {
    abstract fun fightWithOtherPlan()
    abstract fun carryMissile()

}

abstract class CommercialPlan {
    abstract fun provideServiceToPeople()
    abstract fun carryPeople()

}


interface PlanInterFace {

    fun fly()

    fun land()

    fun reFillFuel()

}