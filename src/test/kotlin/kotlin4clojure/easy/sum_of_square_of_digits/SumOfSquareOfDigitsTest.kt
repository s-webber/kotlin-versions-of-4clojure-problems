package kotlin4clojure.easy.sum_of_square_of_digits

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 120. Sum of square of digits
 * 
 * Write a function which takes a range of integers as an argument.
 * Return the count of how many elements are smaller than the sum of their squared component digits.
 * For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.
 */
class SumOfSquareOfDigitsTest {
    @Test fun f1() {
        assertEquals(8, sumOfSquareOfDigits(0..9))
    }

    @Test fun f2() {
        assertEquals(19, sumOfSquareOfDigits(0..29))
    }

    @Test fun f3() {
        assertEquals(50, sumOfSquareOfDigits(0..99))
    }

    @Test fun f4() {
        assertEquals(50, sumOfSquareOfDigits(0..999))
    }
}
