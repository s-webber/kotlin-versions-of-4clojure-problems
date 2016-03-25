package kotlin4clojure.medium.flipping_out

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 46. Flipping out
 * 
 * Write a higher-order function which flips the order of the arguments of an input function.
 */
class FlippingOutTest {
    @Test fun f1() {
        assertEquals(3, flip({a, b -> a[b]}, 2, listOf(1, 2, 3, 4, 5)))
    }

    @Test fun f2() {
        assertTrue(flip({a, b -> a > b}, 7, 8))
    }

    @Test fun f3() {
        assertEquals(4, flip({a, b -> a / b}, 2, 8))
    }

    @Test fun f4() {
        assertEquals(listOf(1, 2, 3), flip({a, b -> b.take(a)}, listOf(1, 2, 3, 4, 5), 3))
    }
}
