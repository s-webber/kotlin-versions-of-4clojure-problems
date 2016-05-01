package kotlin4clojure.easy.reimplement_iterate

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 62. Re-implement Iterate
 * 
 * Given a side-effect free function f and an initial value x write a function
 * which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
 */
class ReimplementIterateTest {
    @Test fun f1() {
        val expected = listOf(1, 2, 4, 8, 16)
        val actual = reimplementIterate({it * 2}, 1).take(5).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = (0..99).toList()
        val actual = reimplementIterate({it + 1}, 0).take(100).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1, 2, 3, 1, 2, 3, 1, 2, 3)
        val actual = reimplementIterate({(it % 3) + 1}, 1).take(9).toList()
        assertEquals(expected, actual)
    }
}
