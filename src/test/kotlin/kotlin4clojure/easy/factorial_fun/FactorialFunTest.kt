package kotlin4clojure.easy.factorial_fun

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 42. Factorial Fun
 * 
 * Write a function which calculates factorials.
 */
class FactorialFunTest {
    @Test fun f1() {
        assertEquals(1, factorial(1))
    }

    @Test fun f2() {
        assertEquals(6, factorial(3))
    }

    @Test fun f3() {
        assertEquals(120, factorial(5))
    }

    @Test fun f4() {
        assertEquals(40320, factorial(8))
    }
}
