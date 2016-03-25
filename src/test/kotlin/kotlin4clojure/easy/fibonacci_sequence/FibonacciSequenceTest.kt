package kotlin4clojure.easy.fibonacci_sequence

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 26. Fibonacci Sequence
 * 
 * Write a function which returns the first X fibonacci numbers.
 */
class FibonacciSequenceTest {
    @Test fun f1() {
        assertEquals(listOf(1, 1, 2), fibonacciSequence(3))
    }

    @Test fun f2() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8), fibonacciSequence(6))
    }

    @Test fun f3() {
        assertEquals(listOf(1, 1, 2, 3, 5, 8, 13, 21), fibonacciSequence(8))
    }
}
