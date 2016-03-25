package kotlin4clojure.easy.recognize_playing_cards

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.easy.recognize_playing_cards.Suit.*

/**
 * 128. Recognize Playing Cards
 * 
 * A standard American deck of playing cards has four suits - spades, hearts, diamonds, and clubs -
 * and thirteen cards in each suit.
 * Two is the lowest rank, followed by other integers up to ten; then the jack, queen, king, and ace.
 *
 * It's convenient for humans to represent these cards as suit/rank pairs, such as H5 or DQ:
 * the heart five and diamond queen respectively. But these forms are not convenient for programmers,
 * so to write a card game you need some way to parse an input string into meaningful components.
 * For purposes of determining rank, we will define the cards to be valued from 0 (the two) to 12 (the ace)
 *
 * Write a function which converts (for example) the string "SJ" into a instance of the Card data class.
 * A ten will always be represented with the single character "T", rather than the two characters "10".
 */
class RecognizePlayingCardsTest {
    @Test fun f1() {
        val expected = Card(DIAMONDS, 10)
        val actual = recognizePlayingCards("DQ")
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = Card(HEARTS, 3)
        val actual = recognizePlayingCards("H5")
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = Card(CLUBS, 12)
        val actual = recognizePlayingCards("CA")
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = (0..12).toList()
        val spades = listOf("S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "ST", "SJ", "SQ", "SK", "SA")
        val actual = spades.map(::recognizePlayingCards).map { it.rank }.toList()
        assertEquals(expected, actual)
    }
}
