package kotlin4clojure.medium.oscilrate

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 144. Oscilrate
 * 
 * Write an oscillating iterate: a function that takes an initial value and a variable number of functions.
 * It should return a lazy sequence of the functions applied to the value in order,
 * restarting from the first function after it hits the end.
 */
class OscilrateTest {
    @Test fun f1() {
        val expected = listOf(3.14, 3, 3.0)
        val initialValue : Number = 3.14
        val actual = oscilrate(initialValue, {it.toInt()}, {it.toDouble()}).take(3).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(3, 0, 5, 2, 7)
        val actual = oscilrate(3, {it - 3}, {5 + it}).take(5).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 3)
        fun inc(x: Int) = x + 1
        fun dec(x: Int) = x - 1
        val actual = oscilrate(0, ::inc, ::dec, ::inc, ::dec, ::inc).take(12).toList()
        assertEquals(expected, actual)
    }
}
