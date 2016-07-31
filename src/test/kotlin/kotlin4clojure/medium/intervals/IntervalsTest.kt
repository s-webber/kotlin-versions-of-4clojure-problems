package kotlin4clojure.medium.intervals

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 171. Intervals
 * 
 * Write a function that takes a list of integers and returns a list of "intervals".
 * Each interval is a a pair of two integers, start and end,
 * such that all integers between start and end (inclusive) are contained in the input list.
 */
class IntervalsTest {
    @Test fun f1() {
        val input = listOf(1, 2, 3)
        val expected = listOf(1 to 3)
        assertEquals(expected, intervals(input).toList())
    }

    @Test fun f2() {
        val input = listOf(10, 9, 8, 1, 2, 3)
        val expected = listOf(1 to 3, 8 to 10)
        assertEquals(expected, intervals(input).toList())
    }

    @Test fun f3() {
        val input = listOf(1, 1, 1, 1, 1, 1, 1)
        val expected = listOf(1 to 1)
        assertEquals(expected, intervals(input).toList())
    }

    @Test fun f4() {
        assertEquals(emptyList(), intervals(emptyList()).toList())
    }

    @Test fun f5() {
        val input = listOf(19, 4, 17, 1, 3, 10, 2, 13, 13, 2, 16, 4, 2, 15, 13, 9, 6, 14, 2, 11)
        val expected = listOf(1 to 4, 6 to 6, 9 to 11, 13 to 17, 19 to 19)
        assertEquals(expected, intervals(input).toList())
    }
}
