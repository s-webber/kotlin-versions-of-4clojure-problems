package kotlin4clojure.hard.longest_increasing_subseq

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 53. Longest Increasing Sub-Seq
 * 
 * Given a list of integers, find the longest consecutive sub-sequence of increasing numbers.
 * If two sub-sequences have the same length, use the one that occurs first.
 * An increasing sub-sequence must have a length of 2 or greater to qualify.
 */
class LongestIncreasingSubSeqTest {
    @Test fun f1() {
        val expected = listOf(0, 1, 2, 3)
        val input = listOf(1, 0, 1, 2, 3, 0, 4, 5)
        assertEquals(expected, longestIncreasingSubSeq(input))
    }

    @Test fun f2() {
        val expected = listOf(5, 6)
        val input = listOf(5, 6, 1, 3, 2, 7)
        assertEquals(expected, longestIncreasingSubSeq(input))
    }

    @Test fun f3() {
        val expected = listOf(3, 4, 5)
        val input = listOf(2, 3, 3, 4, 5)
        assertEquals(expected, longestIncreasingSubSeq(input))
    }

    @Test fun f4() {
        val input = listOf(7, 6, 5, 4)
        assertEquals(emptyList(), longestIncreasingSubSeq(input))
    }
}
