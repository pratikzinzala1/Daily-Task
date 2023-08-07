package task6

abstract class ATMAbstract {

    protected abstract val atmSerialNumber: Int
    protected abstract val atmAvailableBalance: Int
    protected abstract val atmBankName: String
    protected abstract val atmTransactionRecord: MutableList<String>
    protected abstract var insertedAtm: AtmForUser?
    protected abstract var isAuthenticated: Boolean


    abstract fun generateNewAtm(name: String, atmPin: Int)
    abstract fun insertAtmCard(atmCard: AtmForUser)
    abstract fun removeAtmCard()
    abstract fun authentication()
    abstract fun balanceInquiry()
    abstract fun withdrawMoney(withDrawAmount: Int)
    abstract fun withdrawMoney(withDrawAmount: Double)
    abstract fun changePin(newPin: Int)
    abstract fun printListOfTransaction()


}

