package kotlin4clojure.easy.split_a_list

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 49. Split a list
 * 
 * Write a function which will split a list into two parts.
 */
class SplitListTest {
    @Test fun f1() {
        val expected = listOf(1, 2, 3) to listOf(4, 5, 6)
        val actual = splitList(3, listOf(1, 2, 3, 4, 5, 6))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf('a') to listOf('b', 'c', 'd')
        val actual = splitList(1, listOf('a', 'b', 'c', 'd'))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1 to 2, 3 to 4) to listOf(5 to 6)
        val actual = splitList(2, listOf(1 to 2, 3 to 4, 5 to 6))
        assertEquals(expected, actual)
    }
}
