package kotlin4clojure.easy.halftruth

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 83. A Half-Truth
 * 
 * Write a function which takes a variable number of booleans.
 * Your function should return true if some of the parameters are true, but not all of the parameters are true.
 * Otherwise your function should return false.
 */
class HalfTruthTest {
    @Test fun f1() {
        assertFalse(halfTruth(false, false))
    }

    @Test fun f2() {
        assertTrue(halfTruth(true, false))
    }

    @Test fun f3() {
        assertFalse(halfTruth(true))
    }

    @Test fun f4() {
        assertTrue(halfTruth(false, true, false))
    }

    @Test fun f5() {
        assertFalse(halfTruth(true, true, true))
    }

    @Test fun f6() {
        assertTrue(halfTruth(true, true, true, false))
    }
}
