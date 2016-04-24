package kotlin4clojure.medium.rotate_list

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 44. Rotate List
 * 
 * Write a function which can rotate a list in either direction.
 */
class RotateListTest {
    @Test fun f1() {
        val expected = listOf(3, 4, 5, 1, 2)
        val actual = rotateList(2, listOf(1, 2, 3, 4, 5))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(4, 5, 1, 2, 3)
        val actual = rotateList(-2, listOf(1, 2, 3, 4, 5))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(2, 3, 4, 5, 1)
        val actual = rotateList(6, listOf(1, 2, 3, 4, 5))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = listOf('b', 'c', 'a')
        val actual = rotateList(1, listOf('a', 'b', 'c'))
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = listOf('c', 'a', 'b')
        val actual = rotateList(-4, listOf('a', 'b', 'c'))
        assertEquals(expected, actual)
    }
}
