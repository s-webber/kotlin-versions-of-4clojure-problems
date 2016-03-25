package kotlin4clojure.easy.dot_product

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 143. Dot Product
 * 
 * Create a function that computes the dot product of two arrays.
 * You may assume that the arrays will have the same length.
 */
class DotProductTest {
    @Test fun f1() {
        assertEquals(0, dotProduct(arrayOf(0, 1, 0), arrayOf(1, 0, 0)))
    }

    @Test fun f2() {
        assertEquals(3, dotProduct(arrayOf(1, 1, 1), arrayOf(1, 1, 1)))
    }

    @Test fun f3() {
        assertEquals(32, dotProduct(arrayOf(1, 2, 3), arrayOf(4, 5, 6)))
    }

    @Test fun f4() {
        assertEquals(256, dotProduct(arrayOf(2, 5, 6), arrayOf(100, 10, 1)))
    }
}
