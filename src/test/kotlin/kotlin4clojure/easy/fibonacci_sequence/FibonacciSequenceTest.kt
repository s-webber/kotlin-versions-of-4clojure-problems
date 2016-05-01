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
        assertEquals(listOf(1L, 1L, 2L), fibonacciSequence(3))
    }

    @Test fun f2() {
        assertEquals(listOf(1L, 1L, 2L, 3L, 5L, 8L), fibonacciSequence(6))
    }

    @Test fun f3() {
        assertEquals(listOf(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L), fibonacciSequence(8))
    }
}
