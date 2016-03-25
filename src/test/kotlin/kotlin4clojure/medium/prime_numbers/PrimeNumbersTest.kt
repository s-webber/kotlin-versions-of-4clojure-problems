package kotlin4clojure.medium.prime_numbers

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 67. Prime Numbers
 * 
 * Write a function which returns the first x number of prime numbers.
 */
class PrimeNumbersTest {
    @Test fun f1() {
        assertEquals(listOf(2, 3), primeNumbers(2))
    }

    @Test fun f2() {
        assertEquals(listOf(2, 3, 5, 7, 11), primeNumbers(5))
    }

    @Test fun f3() {
        assertEquals(541, primeNumbers(100).last())
    }
}
