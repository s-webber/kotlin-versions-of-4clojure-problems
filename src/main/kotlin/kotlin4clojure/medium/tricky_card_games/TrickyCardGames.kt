package kotlin4clojure.medium.tricky_card_games

fun trickyCardGames(trump: Suit?): (List<Card>) -> Card =
    {
        it.reduce { a, b ->
            when {
                b.suit == trump && a.suit != trump -> b
                b.suit == a.suit && b.rank > a.rank -> b
                else -> a
            }
        }
    }

data class Card(val suit: Suit, val rank: Int)

enum class Suit { SPADES, HEARTS, DIAMONDS, CLUBS }
