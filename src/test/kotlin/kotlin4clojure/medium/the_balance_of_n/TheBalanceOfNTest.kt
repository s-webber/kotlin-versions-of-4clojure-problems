package kotlin4clojure.medium.the_balance_of_n

import kotlin4clojure.util.infiniteSequence
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 115. The Balance of N
 * 
 * A balanced number is one whose component digits have the same sum on the left and right halves of the number.
 * Write a function which accepts an integer n, and returns true iff n is balanced.
 */
class TheBalanceOfNTest {
    @Test fun f1() {
        assertTrue(theBalanceOfN(11))
    }

    @Test fun f2() {
        assertTrue(theBalanceOfN(121))
    }

    @Test fun f3() {
        assertFalse(theBalanceOfN(123))
    }

    @Test fun f4() {
        assertTrue(theBalanceOfN(0))
    }

    @Test fun f5() {
        assertFalse(theBalanceOfN(88099))
    }

    @Test fun f6() {
        assertTrue(theBalanceOfN(89098))
    }

    @Test fun f7() {
        assertTrue(theBalanceOfN(89089))
    }

    @Test fun f8() {
        val expected = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101)
        val actual = infiniteSequence().filter(::theBalanceOfN).take(20).toList()
        assertEquals(expected, actual)
    }
}
