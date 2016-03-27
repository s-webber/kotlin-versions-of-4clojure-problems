package kotlin4clojure.medium.prime_sandwich

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 116. Prime Sandwich
 * 
 * A balanced prime is a prime number which is also the mean of the primes directly before and
 * after it in the sequence of valid primes.
 * Create a function which takes an integer n, and returns true iff it is a balanced prime.
 */
class PrimeSandwichTest {
    @Test fun f1() {
        assertFalse(primeSandwich(4))
    }

    @Test fun f2() {
        assertTrue(primeSandwich(563))
    }

    @Test fun f3() {
        assertEquals(1103, generateSequence(0, { it + 1 }).filter(::primeSandwich).elementAt(15))
    }
}
