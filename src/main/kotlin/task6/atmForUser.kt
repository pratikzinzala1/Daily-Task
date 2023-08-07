package task6

class AtmForUser(var cardHolderName:String,val atmPin:Int){
    init {
        cardHolderName = cardHolderName.filter { !it.isWhitespace() }.lowercase()
    }
}