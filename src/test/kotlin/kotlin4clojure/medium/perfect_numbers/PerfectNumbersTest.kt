package kotlin4clojure.medium.perfect_numbers

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 80. Perfect Numbers
 * 
 * A number is "perfect" if the sum of its divisors equal the number itself. 6 is a perfect number because 1+2+3=6.
 * Write a function which returns true for perfect numbers and false otherwise.
 */
class PerfectNumbersTest {
    @Test fun f1() {
        assertTrue(perfectNumber(6))
    }

    @Test fun f2() {
        assertFalse(perfectNumber(7))
    }

    @Test fun f3() {
        assertTrue(perfectNumber(496))
    }

    @Test fun f4() {
        assertFalse(perfectNumber(500))
    }

    @Test fun f5() {
        assertTrue(perfectNumber(8128))
    }
}
