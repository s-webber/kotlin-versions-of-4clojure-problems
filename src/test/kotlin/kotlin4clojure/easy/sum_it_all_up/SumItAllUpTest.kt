package kotlin4clojure.easy.sum_it_all_up

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 24. Sum It All Up
 * 
 * Write a function which returns the sum of an array of numbers.
 */
class SumItAllUpTest {
    @Test fun f1() {
        assertEquals(6, sumItAllUp(1, 2, 3))
    }

    @Test fun f2() {
        assertEquals(8, sumItAllUp(0, -2, 5, 5))
    }

    @Test fun f3() {
        assertEquals(7, sumItAllUp(4, 2, 1))
    }

    @Test fun f4() {
        assertEquals(-1, sumItAllUp(0, 0, -1))
    }

    @Test fun f5() {
        assertEquals(14, sumItAllUp(1, 10, 3))
    }
}
