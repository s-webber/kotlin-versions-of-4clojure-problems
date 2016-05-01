package kotlin4clojure.medium.palindromic_numbers

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 150. Palindromic Numbers
 * 
 * A palindromic number is a number that is the same when written forwards or backwards (e.g., 3, 99, 14341).
 *
 * Write a function which takes an integer n, as its only argument,
 * and returns an increasing lazy sequence of all palindromic numbers that are not less than n.
 */
class PalindromicNumbersTest {
    @Test fun f1() {
        val expected = sequenceOfLongs(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55,
                                       66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161)
        val actual = palindromicNumbers(0).take(26)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = sequenceOfLongs(171, 181, 191, 202, 212, 222, 232, 242,
                                       252, 262, 272, 282, 292, 303, 313, 323)
        val actual = palindromicNumbers(162).take(16)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = sequenceOfLongs(1234554321, 1234664321, 1234774321,
                                       1234884321, 1234994321, 1235005321)
        val actual = palindromicNumbers(1234550000).take(6)
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = 111111111L * 111111111L
        val actual = palindromicNumbers(expected).first()
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val a = palindromicNumbers(0).take(199).toSet()
        val b = (0..9999).map { palindromicNumbers(it.toLong()).first() }.toSet()
        assertEquals(a, b)
    }

    @Test fun f6() {
        val a = palindromicNumbers(9999999).take(6666).toList()
        assertEquals(a, a.sorted())
    }

    @Test fun f7() {
        val actual = palindromicNumbers(0).drop(10100).first()
        assertEquals(9102019, actual)
    }

    fun sequenceOfLongs(vararg input: Long) = input.asSequence()
}
