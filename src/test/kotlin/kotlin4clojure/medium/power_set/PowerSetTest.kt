package kotlin4clojure.medium.power_set

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 85. Power Set
 * 
 * Write a function which generates the power set of a given set.
 * The power set of a set x is the set of all subsets of x, including the empty set and x itself.
 */
class PowerSetTest {
    @Test fun f1() {
        val expected = setOf(setOf(1, "a"), setOf("a"), emptySet(), setOf(1))
        val actual = setOf(1, "a").powerSet()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = setOf(emptySet<Any>())
        val actual = emptySet<Any>().powerSet()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = setOf(emptySet(),
                             setOf(1), setOf(2), setOf(3),
                             setOf(1, 2), setOf(1, 3), setOf(2, 3),
                             setOf(1, 2, 3))
        val actual = setOf(1, 2, 3).powerSet()
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        assertEquals(1024, ((0..9).toHashSet()).powerSet().size)
    }
}
