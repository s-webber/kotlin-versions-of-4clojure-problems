package kotlin4clojure.medium.tricky_card_games

fun trickyCardGames(trump: Suit?): (List<Card>) -> Card {
    TODO("Add your solution here")
}

data class Card(val suit: Suit, val rank: Int)

enum class Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}
