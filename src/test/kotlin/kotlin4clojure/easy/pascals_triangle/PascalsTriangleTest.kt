package kotlin4clojure.easy.pascals_triangle

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 97. Pascal's Triangle
 * 
 * Pascal's triangle is a triangle of numbers computed using the following rules:
 *
 * * The first row is 1.
 * * Each successive row is computed by adding together adjacent numbers in the row above,
 *   and adding a 1 to the beginning and end of the row.
 *
 * Write a function which returns the nth row of Pascal's Triangle.
 */
class PascalsTriangleTest {
    @Test fun f1() {
        val expected = listOf(1)
        val actual = pascalsTriangle(1)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(listOf(1),
                              listOf(1, 1),
                              listOf(1, 2, 1),
                              listOf(1, 3, 3, 1),
                              listOf(1, 4, 6, 4, 1))
        val actual = (1..5).map(::pascalsTriangle).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1)
        val actual = pascalsTriangle(11)
        assertEquals(expected, actual)
    }
}
