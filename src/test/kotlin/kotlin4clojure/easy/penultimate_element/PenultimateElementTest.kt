package kotlin4clojure.easy.penultimate_element

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 20. Penultimate Element
 * 
 * Write a function which returns the second to last element from a list.
 */
class PenultimateElementTest {
    @Test fun f1() {
        assertEquals(4, penultimateElement(listOf(1, 2, 3, 4, 5)))
    }

    @Test fun f2() {
        assertEquals("b", penultimateElement(listOf("a", "b", "c")))
    }

    @Test fun f3() {
        assertEquals(Pair(1, 2), penultimateElement(listOf(Pair(1, 2), Pair(3, 4))))
    }
}
