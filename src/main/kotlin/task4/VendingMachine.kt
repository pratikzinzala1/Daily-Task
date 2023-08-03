package task4

class VendingMachine : VendingInterface {

    override val machineCompany: String = "TATA Vending machine"

    override val drinkList: MutableList<Drink> = mutableListOf()
    override var insertedAmount: Int = 0
        private set
    override var selectedDrink: Int? = null
        private set

    override fun insertMoney(money: Int) {
        insertedAmount = money
    }

    override fun selectProduct(option: Int) {
        selectedDrink = option
    }

    override fun buyDrink(name: Drinks) {

    }

    override fun listDrink() {
        drinkList.forEach {
            it.printDrink()
        }
    }

    override fun returnMoney(callBack: (Int) -> Int) {
        callBack(insertedAmount)
        insertedAmount = 0
    }

    override fun initializeMachine() {
        drinkList.add(Drink(Drinks.COCK, 20, 4))
        drinkList.add(Drink(Drinks.ORANGE, 15, 5))
        drinkList.add(Drink(Drinks.THUMPS_UP, 30, 3))

    }
}