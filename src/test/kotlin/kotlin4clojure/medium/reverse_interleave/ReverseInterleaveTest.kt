package kotlin4clojure.medium.reverse_interleave

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 43. Reverse Interleave
 * 
 * Write a function which reverses the interleave process into x number of sub-lists.
 */
class ReverseInterleaveTest {
    @Test fun f1() {
        val expected = listOf(listOf(1, 3, 5), listOf(2, 4, 6))
        val actual = reverseInterleave(listOf(1, 2, 3, 4, 5, 6), 2)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(listOf(0, 3, 6), listOf(1, 4, 7), listOf(2, 5, 8))
        val actual = reverseInterleave((0..8).toList(), 3)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(listOf(0, 5), listOf(1, 6), listOf(2, 7), listOf(3, 8), listOf(4, 9))
        val actual = reverseInterleave((0..9).toList(), 5)
        assertEquals(expected, actual)
    }
}
