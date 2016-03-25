package kotlin4clojure.medium.happy_numbers

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 86. Happy numbers
 * 
 * Happy numbers are positive integers that follow a particular formula:
 * take each individual digit, square it, and then sum the squares to get a new number.
 * Repeat with the new number and eventually, you might get to a number whose squared sum is 1.
 * This is a happy number. An unhappy number (or sad number) is one that loops endlessly.
 * Write a function that determines if a number is happy or not.
 */
class HappyNumbersTest {
    @Test fun f1() {
        assertTrue(happyNumber(7))
    }

    @Test fun f2() {
        assertTrue(happyNumber(986543210))
    }

    @Test fun f3() {
        assertFalse(happyNumber(2))
    }

    @Test fun f4() {
        assertFalse(happyNumber(3))
    }
}
