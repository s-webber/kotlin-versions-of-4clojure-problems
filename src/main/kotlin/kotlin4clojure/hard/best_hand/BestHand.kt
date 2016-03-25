package kotlin4clojure.hard.best_hand

fun rank(vararg cards: String): Rank {
    // TODO Add your solution here.
    throw RuntimeException()
}

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
