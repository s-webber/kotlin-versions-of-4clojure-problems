package kotlin4clojure.easy.palindrome_detector

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 27. Palindrome Detector
 * 
 * Write a function which returns true if the given array is a palindrome.
 */
class PalindromeDetectorTest {
    @Test fun f1() {
        assertFalse(palindromeDetector(1, 2, 3, 4, 5))
    }

    @Test fun f2() {
        assertTrue(palindromeDetector("racecar".toCharArray()))
    }

    @Test fun f3() {
        assertTrue(palindromeDetector("foo", "bar", "foo"))
    }

    @Test fun f4() {
        assertTrue(palindromeDetector(1, 1, 3, 3, 1, 1))
    }

    @Test fun f5() {
        assertFalse(palindromeDetector("a", "b", "c"))
    }
}
