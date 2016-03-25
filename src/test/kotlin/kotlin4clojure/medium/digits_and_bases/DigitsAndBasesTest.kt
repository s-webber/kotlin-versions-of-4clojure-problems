package kotlin4clojure.medium.digits_and_bases

import java.util.Random
import kotlin.test.assertEquals
import org.junit.Test

/**
 * 137. Digits and bases
 * 
 * Write a function which returns a list of digits of a non-negative number (first argument) in numerical system
 * with an arbitrary base (second argument). Digits should be represented with their integer values,
 * e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16.
 */
class DigitsAndBasesTest {
    @Test fun f1() {
        assertEquals(listOf(1, 2, 3, 4, 5, 0, 1), digits(1234501, 10))
    }

    @Test fun f2() {
        assertEquals(listOf(0), digits(0, 11))
    }

    @Test fun f3() {
        assertEquals(listOf(1, 0, 0, 1), digits(9, 2))
    }

    @Test fun f4() {
        val n = Random().nextInt(100000)
        assertEquals(listOf(1, 0), digits(n, n))
    }

    @Test fun f5() {
        assertEquals(listOf(16, 18, 5, 24, 15, 1), digits(Int.MAX_VALUE, 42))
    }
}
