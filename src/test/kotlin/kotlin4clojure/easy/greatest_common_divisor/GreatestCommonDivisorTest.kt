package kotlin4clojure.easy.greatest_common_divisor

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 66. Greatest Common Divisor
 * 
 * Given two integers, write a function which returns the greatest common divisor.
 */
class GreatestCommonDivisorTest {
    @Test fun f1() {
        assertEquals(2, greatestCommonDivisor(2, 4))
    }

    @Test fun f2() {
        assertEquals(5, greatestCommonDivisor(10, 5))
    }

    @Test fun f3() {
        assertEquals(1, greatestCommonDivisor(5, 7))
    }

    @Test fun f4() {
        assertEquals(33, greatestCommonDivisor(1023, 858))
    }
}
