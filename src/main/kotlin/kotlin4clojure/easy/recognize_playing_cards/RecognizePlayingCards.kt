package kotlin4clojure.easy.recognize_playing_cards

import kotlin4clojure.easy.recognize_playing_cards.Suit.*

fun recognizePlayingCards(input: String): Card {
    val suit = suitMappings[input[0]]
    val rank = rankMappings[input[1]]
    return Card(suit!!, rank!!)
}

val suitMappings = mapOf('S' to SPADES, 'H' to HEARTS, 'D' to DIAMONDS, 'C' to CLUBS)
val rankMappings = listOf('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A').
                   mapIndexed { i, c -> Pair(c, i) }.
                   toMap()

data class Card(val suit: Suit, val rank: Int)

enum class Suit { SPADES, HEARTS, DIAMONDS, CLUBS }
