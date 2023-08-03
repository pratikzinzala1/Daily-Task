package task4

interface VendingInterface {

    val machineCompany: String
    val drinkList: List<Drink>
    val insertedAmount: Int
    val selectedDrink: Int?

    fun selectProduct(option: Int)
    fun insertMoney(money: Int)
    fun insertMoney(money: Int,coupon:Int)
    fun buyDrink()
    fun listDrink()

    fun initializeMachine()

    fun returnMoney(callBack: (Int) -> Unit)

}