package kotlin4clojure.easy.symmetric_difference

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 88. Symmetric Difference
 * 
 * Write a function which returns the symmetric difference of two sets.
 * The symmetric difference is the set of items belonging to one but not both of the two sets.
 */
class SymmetricDifferenceTest {
    @Test fun f1() {
        val expected = setOf(2, 4, 6, 7)
        val actual = symmetricDifference(setOf(1, 2, 3, 4, 5, 6), setOf(1, 3, 5, 7))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = setOf("a", "b", "c")
        val actual = symmetricDifference(setOf("a", "b", "c"), emptySet())
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = setOf(4, 5, 6)
        val actual = symmetricDifference(emptySet(), setOf(4, 5, 6))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = setOf(1 to 2, 3 to 4)
        val actual = symmetricDifference(setOf(1 to 2, 2 to 3), setOf(2 to 3, 3 to 4))
        assertEquals(expected, actual)
    }
}
