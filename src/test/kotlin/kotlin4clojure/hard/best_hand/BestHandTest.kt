package kotlin4clojure.hard.best_hand

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.hard.best_hand.Rank.*

/**
 * 178. Best Hand
 * 
 * Following on from Recognize Playing Cards, determine the best poker hand that can be made with five cards.
 * The hand rankings are listed below for your convenience.
 *
 * 1. Straight flush: All cards in the same suit, and in sequence
 * 2. Four of a kind: Four of the cards have the same rank
 * 3. Full House: Three cards of one rank, the other two of another rank
 * 4. Flush: All cards in the same suit
 * 5. Straight: All cards in sequence (aces can be high or low, but not both at once)
 * 6. Three of a kind: Three of the cards have the same rank
 * 7. Two pair: Two pairs of cards have the same rank
 * 8. Pair: Two cards have the same rank
 * 9. High card: None of the above conditions are met
 */
class BestHandTest {
    @Test fun f1() {
        assertEquals(HIGH_CARD, rank("HA", "D2", "H3", "C9", "DJ"))
    }

    @Test fun f2() {
        assertEquals(PAIR, rank("HA", "HQ", "SJ", "DA", "HT"))
    }

    @Test fun f3() {
        assertEquals(TWO_PAIR, rank("HA", "DA", "HQ", "SQ", "HT"))
    }

    @Test fun f4() {
        assertEquals(THREE_OF_A_KIND, rank("HA", "DA", "CA", "HJ", "HT"))
    }

    @Test fun f5() {
        assertEquals(STRAIGHT, rank("HA", "DK", "HQ", "HJ", "HT"))
    }

    @Test fun f6() {
        assertEquals(STRAIGHT, rank("HA", "H2", "S3", "D4", "C5"))
    }

    @Test fun f7() {
        assertEquals(FLUSH, rank("HA", "HK", "H2", "H4", "HT"))
    }

    @Test fun f8() {
        assertEquals(FULL_HOUSE, rank("HA", "DA", "CA", "HJ", "DJ"))
    }

    @Test fun f9() {
        assertEquals(FOUR_OF_A_KIND, rank("HA", "DA", "CA", "SA", "DJ"))
    }

    @Test fun f10() {
        assertEquals(STRAIGHT_FLUSH, rank("HA", "HK", "HQ", "HJ", "HT"))
    }
}
