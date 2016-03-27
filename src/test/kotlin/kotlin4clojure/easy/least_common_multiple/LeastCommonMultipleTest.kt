package kotlin4clojure.easy.least_common_multiple

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 100. Least Common Multiple
 * 
 * Write a function which calculates the least common multiple.
 * Your function should accept a variable number of Ratio instances.
 */
class LeastCommonMultipleTest {
    @Test fun f1() {
        assertEquals(Ratio(6), leastCommonMultiple(Ratio(2), Ratio(3)))
    }

    @Test fun f2() {
        assertEquals(Ratio(105), leastCommonMultiple(Ratio(5), Ratio(3), Ratio(7)))
    }

    @Test fun f3() {
        assertEquals(Ratio(2), leastCommonMultiple(Ratio(1, 3), Ratio(2, 5)))
    }

    @Test fun f4() {
        assertEquals(Ratio(3, 2), leastCommonMultiple(Ratio(3, 4), Ratio(1, 6)))
    }

    @Test fun f5() {
        assertEquals(Ratio(210), leastCommonMultiple(Ratio(7), Ratio(5, 7), Ratio(2), Ratio(3, 5)))
    }
}
