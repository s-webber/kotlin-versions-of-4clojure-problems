package kotlin4clojure.medium.tricky_card_games

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.medium.tricky_card_games.Suit.*

/**
 * 141. Tricky card games
 * 
 * In trick-taking card games such as bridge, spades, or hearts, cards are played in groups known as "tricks" -
 * each player plays a single card, in order; the first player is said to "lead" to the trick.
 * After all players have played, one card is said to have "won" the trick.
 * How the winner is determined will vary by game, but generally the winner is the
 * highest card played in the suit that was led.
 * Sometimes (again varying by game), a particular suit will be designated "trump",
 * meaning that its cards are more powerful than any others: if there is a trump suit,
 * and any trumps are played, then the highest trump wins regardless of what was led.
 *
 * Your goal is to devise a function that can determine which of a number of cards has won a trick.
 * You should accept a trump suit, and return a function winner. Winner will be called on a sequence of cards,
 * and should return the one which wins the trick. Cards with a larger rank are stronger.
 */
class TrickyCardGamesTest {
    @Test fun f1() {
        val f = trickyCardGames(null)
        val cards = listOf(Card(CLUBS, 4), Card(CLUBS, 9))
        assertEquals(cards.last(), f(cards))
    }

    @Test fun f2() {
        val f = trickyCardGames(null)
        val cards = listOf(Card(SPADES, 2), Card(CLUBS, 10))
        assertEquals(cards.first(), f(cards))
    }

    @Test fun f3() {
        val f = trickyCardGames(CLUBS)
        val cards = listOf(Card(SPADES, 2), Card(CLUBS, 10))
        assertEquals(cards.last(), f(cards))
    }

    @Test fun f4() {
        val f = trickyCardGames(HEARTS)
        val cards = listOf(Card(HEARTS, 6), Card(HEARTS, 8),Card(DIAMONDS, 10), Card(HEARTS, 4))
        assertEquals(cards.get(1), f(cards))
    }
}
