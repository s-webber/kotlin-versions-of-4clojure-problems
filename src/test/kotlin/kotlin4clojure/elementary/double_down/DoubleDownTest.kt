package kotlin4clojure.elementary.double_down

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 15. Double Down
 *
 * Write a function which doubles a number.
 */
class DoubleDownTest {
    @Test fun f1() {
        assertEquals(4, doubleDown(2))
    }

    @Test fun f2() {
        assertEquals(6, doubleDown(3))
    }

    @Test fun f3() {
        assertEquals(22, doubleDown(11))
    }

    @Test fun f4() {
        assertEquals(14, doubleDown(7))
    }
}
