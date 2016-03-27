package kotlin4clojure.easy.product_digits

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 99. Product Digits
 * 
 * Write a function which multiplies two numbers and returns the result as a list of its digits.
 */
class ProductDigitsTest {
    @Test fun f1() {
        val expected = listOf(1)
        val actual = productDigits(1, 1)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(8, 9, 1)
        val actual = productDigits(99, 9)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(9, 8, 9, 0, 1)
        val actual = productDigits(999, 99)
        assertEquals(expected, actual)
    }
}
