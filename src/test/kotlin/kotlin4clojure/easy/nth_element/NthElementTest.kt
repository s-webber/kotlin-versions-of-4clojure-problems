package kotlin4clojure.easy.nth_element

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 21. Nth Element
 * 
 * Write a function which returns the Nth element from a list.
 */
class NthElementTest {
    @Test fun f1() {
        assertEquals(6, nthElement(listOf(4, 5, 6, 7), 2))
    }

    @Test fun f2() {
        assertEquals("a", nthElement(listOf("a", "b", "c"), 0))
    }

    @Test fun f3() {
        assertEquals(2, nthElement(listOf(1, 2, 3, 4), 1))
    }

    @Test fun f4() {
        assertEquals(5 to 6, nthElement(listOf(1 to 2, 3 to 4, 5 to 6), 2))
    }
}
