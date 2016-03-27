package kotlin4clojure.easy.recognize_playing_cards

fun recognizePlayingCards(input: String): Card {
    TODO("Add your solution here")
}

data class Card(val suit: Suit, val rank: Int)

enum class Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}
