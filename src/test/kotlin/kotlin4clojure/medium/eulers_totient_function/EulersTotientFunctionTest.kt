package kotlin4clojure.medium.eulers_totient_function

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 75. Euler's Totient Function
 * 
 * Two numbers are coprime if their greatest common divisor equals 1.
 * Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.
 * The special case f(1) equals 1. Write a function which calculates Euler's totient function.
 */
class EulersTotientFunctionTest {
    @Test fun f1() {
        assertEquals(1, eulerTotient(1))
    }

    @Test fun f2() {
    }

    @Test fun f3() {
        assertEquals(16, eulerTotient(40))
    }

    @Test fun f4() {
        assertEquals(60, eulerTotient(99))
    }
}
