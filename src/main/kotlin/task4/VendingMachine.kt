package task4

class VendingMachine : VendingInterface {


    override val machineCompany: String = "************** TATA Vending machine **************"

    override val drinkList: MutableList<Drink> = mutableListOf()

    override var insertedAmount: Int = 0
        private set
    override var selectedDrink: Int? = null
        private set

    private val couponList:List<Int> = listOf(123,456)

    override fun insertMoney(money: Int) {
        insertedAmount = money
    }

    override fun insertMoney(money: Int, coupon: Int) {
        if (couponList.contains(coupon)){
            insertedAmount = money + 20
        }
        else{
            println("invalid coupon")
        }
    }

    override fun selectProduct(option: Int) {
        selectedDrink = option
    }

    override fun buyDrink() {
        drinkList[selectedDrink!!].updateDrink(insertedAmount) {remainingAmount->
            insertedAmount = remainingAmount
            returnMoney {
                if (it>0) println("Here is your money $it")
            }
        }
    }

    override fun listDrink() {
        for (i in drinkList.indices)
            drinkList[i].printDrink(i)
    }


    override fun returnMoney(callBack: (Int) -> Unit) {
        callBack(insertedAmount)
        insertedAmount = 0
    }

    override fun initializeMachine() {
        drinkList.add(Drink(Drinks.COCK, 20, 4))
        drinkList.add(Drink(Drinks.ORANGE, 15, 5))
        drinkList.add(Drink(Drinks.THUMPS_UP, 30, 3))
    }


}