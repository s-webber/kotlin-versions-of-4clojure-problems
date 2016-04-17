package kotlin4clojure.medium.generating_kcombinations

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 103. Generating k-combinations
 * 
 * Given a list S consisting of n elements generate all k-combinations of S,
 * i. e. generate all possible sets consisting of k distinct elements taken from S.
 * The number of k-combinations for a set is equal to the binomial coefficient.
 */
class GeneratingKcombinationsTest {
    @Test fun f1() {
        val expected = setOf(setOf(4), setOf(5), setOf(6))
        val actual = kcombinations(1, setOf(4, 5, 6))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        assertEquals(emptySet(), kcombinations(10, setOf(4, 5, 6)))
    }

    @Test fun f3() {
        val expected = setOf(setOf(0, 1), setOf(0, 2), setOf(1, 2))
        val actual = kcombinations(2, setOf(0, 1, 2))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = setOf(setOf(0, 1, 2), setOf(0, 1, 3), setOf(0, 1, 4), setOf(0, 2, 3), setOf(0, 2, 4),
                             setOf(0, 3, 4), setOf(1, 2, 3), setOf(1, 2, 4), setOf(1, 3, 4), setOf(2, 3, 4))
        val actual = kcombinations(3, setOf(0, 1, 2, 3, 4))
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = setOf(setOf(listOf(1, 2, 3), "a", "abc", "efg"))
        val actual = kcombinations(4, setOf(listOf(1, 2, 3), "a", "abc", "efg"))
        assertEquals(expected, actual)
    }

    @Test fun f6() {
        val expected = setOf(setOf(listOf(1, 2, 3), "a"), setOf(listOf(1, 2, 3), "abc"), setOf(listOf(1, 2, 3), "efg"),
                             setOf("a", "abc"), setOf("a", "efg"), setOf("abc", "efg"))
        val actual = kcombinations(2, setOf(listOf(1, 2, 3), "a", "abc", "efg"))
        assertEquals(expected, actual)
    }
}
