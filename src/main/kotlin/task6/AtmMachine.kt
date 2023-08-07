package task6

object GenerateUID {
    private val oldUid = mutableListOf<Int>()
    fun uid(): Int {
        val random = (123456789..999999999).random()

        return if (oldUid.contains(random)) {
            uid()
        } else {
            oldUid.add(random)
            random
        }
    }
}


class AtmMachine(
    override val atmSerialNumber: Int,
    override var atmAvailableBalance: Int,
    override val atmBankName: String
) : ATMAbstract() {

    override var isAuthenticated: Boolean = false
    override var insertedAtm: AtmForUser? = null
    private val allAtmCardList: MutableList<AtmCard> = mutableListOf()
    override val atmTransactionRecord: MutableList<String> = mutableListOf()
    private var selectedAtmFromRecord: Int? = null

    override fun generateNewAtm(name: String, atmPin: Int) {
        val card = AtmCard(name, atmPin, GenerateUID.uid())
        card.addFund(25000)
        allAtmCardList.add(card)
    }

    override fun insertAtmCard(atmCard: AtmForUser) {
        insertedAtm = atmCard
        println("Card Inserted....")
    }

    override fun removeAtmCard() {
        insertedAtm = null
        isAuthenticated = false
        println("Card Removed....")
    }

    override fun authentication() {
        if (insertedAtm != null) {
            for (i in allAtmCardList.indices) {
                if (allAtmCardList[i].compare(insertedAtm!!)) {
                    selectedAtmFromRecord = i
                    isAuthenticated = true
                }
            }
            if (isAuthenticated) {
                println("User authenticated you can move farther")
            } else {
                println("User not authenticated please insert correct pin or card")
            }
        } else {
            println("Please enter atm first")
        }
    }
    override fun balanceInquiry() {
        checkAtm {
            println("Your available balance is ${allAtmCardList[selectedAtmFromRecord!!].getAvailableBalance()}")
        }
    }
    override fun withdrawMoney(withDrawAmount: Int) {
        checkAtm {
            allAtmCardList[selectedAtmFromRecord!!].withdrawBalance(withDrawAmount.toDouble()) {
                atmTransactionRecord.add(it)
            }
        }
    }
    override fun withdrawMoney(withDrawAmount: Double) {
        checkAtm {
            allAtmCardList[selectedAtmFromRecord!!].withdrawBalance(Math.round(withDrawAmount * 10.0) / 10.0) {
                atmTransactionRecord.add(it)
            }
        }
    }
    override fun printListOfTransaction() {
        atmTransactionRecord.forEach {
            println(it)
        }
    }
    override fun changePin(newPin: Int) {
        checkAtm {
            allAtmCardList[selectedAtmFromRecord!!].updatePin(newPin)
        }
    }
    private fun checkAtm(callback: () -> Unit) {
        if (insertedAtm != null && isAuthenticated) {
            callback()
        } else {
            println("Something went wrong")
        }
        removeAtmCard()
    }
}


private class AtmCard(var cardHolderName: String, private var atmPin: Int, val atmNumber: Int) {
    init {
        cardHolderName = cardHolderName.filter { !it.isWhitespace() }.lowercase()
    }
    private var availableBalance: Double = 0.0
    fun getAvailableBalance(): Double {
        return availableBalance
    }
    fun addFund(balance: Int) {
        availableBalance += balance
    }
    fun withdrawBalance(balance: Double, callback: (String) -> Unit) {
        if (availableBalance <= 0) {
            println("Balance not enough")
        } else if (availableBalance - balance < 0) {
            println("insufficient balance")
        } else {
            availableBalance -= balance
            println("You have withdraw $balance and your new balance is $availableBalance")
            callback("Rs:$balance withdraw from $atmNumber new balance is $availableBalance")
        }
    }
    fun updatePin(newPin: Int) {
        atmPin = newPin
        println("Your pin is updated")
    }
    fun compare(other: AtmForUser): Boolean {
        return if (this.cardHolderName != other.cardHolderName)
            false
        else if (this.atmPin != other.atmPin)
            false
        else true
    }
}