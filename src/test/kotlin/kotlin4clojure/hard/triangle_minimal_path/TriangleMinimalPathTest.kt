package kotlin4clojure.hard.triangle_minimal_path

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 79. Triangle Minimal Path
 * 
 * Write a function which calculates the sum of the minimal path through a triangle.
 * The triangle is represented as a collection of lists.
 * The path should start at the top of the triangle and move to an adjacent number
 * on the next row until the bottom of the triangle is reached.
 */
class TriangleMinimalPathTest {
    @Test fun f1() {
        val input = listOf(listOf(1),
                          listOf(2, 4),
                        listOf(5, 1, 4),
                       listOf(2, 3, 4, 5))
        val expected = 7 // 1->2->1->3
        assertEquals(expected, triangleMinimalPath(input))
    }

    @Test fun f2() {
        val input = listOf(listOf(3),
                          listOf(2, 4),
                        listOf(1, 9, 3),
                       listOf(9, 9, 2, 4),
                     listOf(4, 6, 7, 8, 8),
                    listOf(5, 7, 3, 5, 1, 4))
        val expected = 20 // 3->4->3->2->7->1
        assertEquals(expected, triangleMinimalPath(input))
    }
}
