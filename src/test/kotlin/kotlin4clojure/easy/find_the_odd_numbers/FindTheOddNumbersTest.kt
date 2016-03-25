package kotlin4clojure.easy.find_the_odd_numbers

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 25. Find the odd numbers
 * 
 * Write a function which returns only the odd numbers from a list.
 */
class FindTheOddNumbersTest {
    @Test fun f1() {
        assertEquals(listOf(1, 3, 5), findOddNumbers(setOf(1, 2, 3, 4, 5)))
    }

    @Test fun f2() {
        assertEquals(listOf(1), findOddNumbers(listOf(4, 2, 1, 6)))
    }

    @Test fun f3() {
        assertEquals(emptyList(), findOddNumbers(listOf(2, 2, 4, 6)))
    }

    @Test fun f4() {
        assertEquals(listOf(1, 1, 1, 3), findOddNumbers(listOf(1, 1, 1, 3)))
    }
}
