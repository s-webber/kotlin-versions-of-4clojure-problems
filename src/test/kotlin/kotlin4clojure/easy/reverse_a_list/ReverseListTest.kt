package kotlin4clojure.easy.reverse_a_list

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 23. Reverse a List
 * 
 * Write a function which reverses a list.
 */
class ReverseListTest {
    @Test fun f1() {
        val expected = listOf(5, 4, 3, 2, 1)
        val actual = reverseList(listOf(1, 2, 3, 4, 5))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(7, 5, 2)
        val actual = reverseList(listOf(2, 5, 7))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(5 to 6, 3 to 4, 1 to 2)
        val actual = reverseList(listOf(1 to 2, 3 to 4, 5 to 6))
        assertEquals(expected, actual)
    }
}
