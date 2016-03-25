package kotlin4clojure.medium.sum_some_set_subsets

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 131. Sum Some Set Subsets
 * 
 * Given a variable number of sets of integers, create a function which returns true iff all of the sets
 * have a non-empty subset with an equivalent summation.
 */
class SumSomeSetSubsetsTest {
    @Test fun f1() {
        // all sets have a subset which sums to zero
        assertTrue(sumSomeSetSubsets(setOf(-1, 1, 99),
                                     setOf(-2, 2, 888),
                                     setOf(-3, 3, 7777)))
    }

    @Test fun f2() {
        assertFalse(sumSomeSetSubsets(setOf(1),
                                      setOf(2),
                                      setOf(3),
                                      setOf(4)))
    }

    @Test fun f3() {
        assertTrue(sumSomeSetSubsets(setOf(1)))
    }

    @Test fun f4() {
        assertFalse(sumSomeSetSubsets(setOf(1, -3, 51, 9),
                                      setOf(0),
                                      setOf(9, 2, 81, 33)))
    }

    @Test fun f5() {
        assertTrue(sumSomeSetSubsets(setOf(1, 3, 5),
                                     setOf(9, 11, 4),
                                     setOf(-3, 12, 3),
                                     setOf(-3, 4, -2, 10)))
    }

    @Test fun f6() {
        assertFalse(sumSomeSetSubsets(setOf(-1, -2, -3, -4, -5, -6),
                                      setOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    }

    @Test fun f7() {
        assertTrue(sumSomeSetSubsets(setOf(1, 3, 5, 7),
                                     setOf(2, 4, 6, 8)))
    }

    @Test fun f8() {
        assertTrue(sumSomeSetSubsets(setOf(-1, 3, -5, 7, -9, 11, -13, 15),
                                     setOf(1, -3, 5, -7, 9, -11, 13, -15),
                                     setOf(1, -1, 2, -2, 4, -4, 8, -8)))
    }

    @Test fun f9() {
        assertTrue(sumSomeSetSubsets(setOf(-10, 9, -8, 7, -6, 5, -4, 3, -2, 1),
                                     setOf(10, -9, 8, -7, 6, -5, 4, -3, 2, -1)))
    }
}
