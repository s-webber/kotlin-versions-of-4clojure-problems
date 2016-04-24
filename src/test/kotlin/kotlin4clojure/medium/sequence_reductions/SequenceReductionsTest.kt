package kotlin4clojure.medium.sequence_reductions

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 60. Sequence Reductions
 * 
 * Write a function which behaves like reduce, but returns each intermediate value of the reduction.
 * The return sequence must be lazy.
 */
class SequenceReductionsTest {
    @Test fun f1() {
        val expected = sequenceOf(0, 1, 3, 6, 10)
        val actual = sequenceReductions({a, b -> a + b}, generateSequence(0, {it + 1}))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = sequenceOf(listOf(1), listOf(1, 2), listOf(1, 2, 3), listOf(1, 2, 3, 4 ))
        val actual = sequenceReductions({a, b -> a + b}, listOf(1), sequenceOf(2, 3, 4))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = 120
        val actual = sequenceReductions({a, b -> a * b}, 2, sequenceOf(3, 4, 5)).last()
        assertEquals(expected, actual)
    }
}
