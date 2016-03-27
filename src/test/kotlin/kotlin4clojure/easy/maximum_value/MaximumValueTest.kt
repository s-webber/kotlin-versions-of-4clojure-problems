package kotlin4clojure.easy.maximum_value

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 38. Maximum value
 * 
 * Write a function which takes a variable number of parameters and returns the maximum value
 */
class MaximumValueTest {
    @Test fun f1() {
        assertEquals(8, maximumValue(1, 8, 3, 4))
    }

    @Test fun f2() {
        assertEquals(30, maximumValue(30, 20))
    }

    @Test fun f3() {
        assertEquals(67, maximumValue(54, 67, 11))
    }
}
