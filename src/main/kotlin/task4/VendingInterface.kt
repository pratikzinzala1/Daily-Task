package task4

interface VendingInterface {

    val machineCompany: String
    val drinkList: List<Drink>
    val insertedAmount: Int
    val selectedDrink: Int?

    fun selectProduct(option: Int)
    fun insertMoney(money: Int)
    fun buyDrink(name: Drinks)
    fun listDrink()

    fun initializeMachine()

    fun returnMoney(callBack: (Int) -> Int)

}