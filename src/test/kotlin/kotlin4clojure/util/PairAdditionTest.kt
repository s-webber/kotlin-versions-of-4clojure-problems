package kotlin4clojure.util

import org.junit.Test
import kotlin.test.assertEquals

class PairAdditionTest {
    @Test fun test() {
        val expected = 11 to 8
        val a = 9 to 3
        val b = 2 to 5
        assertEquals(expected, a + b)
        assertEquals(expected, b + a)
    }
}
