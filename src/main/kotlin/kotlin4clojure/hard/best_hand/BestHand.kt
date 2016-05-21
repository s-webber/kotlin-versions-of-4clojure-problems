package kotlin4clojure.hard.best_hand

import kotlin4clojure.hard.best_hand.Rank.*
import kotlin4clojure.easy.recognize_playing_cards.recognizePlayingCards
import kotlin4clojure.easy.recognize_playing_cards.Card
import kotlin4clojure.easy.recognize_playing_cards.Suit.*

fun rank(vararg input: String): Rank {
    val cards = input.map(::recognizePlayingCards).toList()
    val sortedSizeByRank = cards.groupBy { it.rank }
                                .values
                                .map { it.size }
                                .sortedDescending()

    return when {
        straightFlush(cards) -> STRAIGHT_FLUSH
        fourOfAKind(sortedSizeByRank) -> FOUR_OF_A_KIND
        fullHouse(sortedSizeByRank) -> FULL_HOUSE
        flush(cards) -> FLUSH
        straight(cards) -> STRAIGHT
        threeOfAKind(sortedSizeByRank) -> THREE_OF_A_KIND
        twoPair(sortedSizeByRank) -> TWO_PAIR
        pair(sortedSizeByRank) -> PAIR
        else -> HIGH_CARD
    }
}

fun straightFlush(cards: List<Card>) =
    flush(cards) && straight(cards)

fun fourOfAKind(sortedSizeByRank: List<Int>) =
    sortedSizeByRank[0] == 4

fun fullHouse(sortedSizeByRank: List<Int>) =
    sortedSizeByRank[0] == 3 && sortedSizeByRank[1] == 2

fun flush(cards: List<Card>) =
    cards.all { it.suit == cards[0].suit }

fun straight(cards: List<Card>): Boolean {
    cards.map { it.rank }.sorted().reduce { r1, r2 ->
        when {
            r1 == r2 - 1 -> r2
            r1 == 3 && r2 == 12 -> r2
            else -> return false
        }
    }
    return true
}

fun threeOfAKind(sortedSizeByRank: List<Int>) =
    sortedSizeByRank[0] == 3

fun twoPair(sortedSizeByRank: List<Int>) =
    sortedSizeByRank[0] == 2 && sortedSizeByRank[1] == 2

fun pair(sortedSizeByRank: List<Int>) =
    sortedSizeByRank[0] == 2

val suitMappings =
    mapOf('S' to SPADES, 'H' to HEARTS, 'D' to DIAMONDS, 'C' to CLUBS)

val rankMappings =
    listOf('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A').mapIndexed { i, c -> Pair(c, i) }.toMap()

enum class Rank {
    STRAIGHT_FLUSH,
    FOUR_OF_A_KIND,
    FULL_HOUSE,
    FLUSH,
    STRAIGHT,
    THREE_OF_A_KIND,
    TWO_PAIR,
    PAIR,
    HIGH_CARD
}
