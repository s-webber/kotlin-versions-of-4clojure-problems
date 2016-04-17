package kotlin4clojure.easy.last_element

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 19. Last Element
 * 
 * Write a function which returns the last element in a list.
 */
class LastElementTest {
    @Test fun f1() {
        assertEquals(5, lastElement(listOf(1, 2, 3, 4, 5)))
    }

    @Test fun f2() {
        assertEquals(3, lastElement(listOf(5, 4, 3)))
    }

    @Test fun f3() {
        assertEquals("d", lastElement(listOf("b", "c", "d")))
    }
}
