package kotlin4clojure.easy.set_intersection

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 81. Set Intersection
 * 
 * Write a function which returns the intersection of two sets.
 * The intersection is the sub-set of items that each set has in common.
 */
class SetIntersectionTest {
    @Test fun f1() {
        val expected = setOf(2, 3)
        val actual = setIntersection(setOf(0, 1, 2, 3), setOf(2, 3, 4, 5))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val actual = setIntersection(setOf(0, 1, 2), setOf(3, 4, 5))
        assertEquals(emptySet(), actual)
    }

    @Test fun f3() {
        val expected = setOf("a", "c", "d")
        val actual = setIntersection(setOf("a", "b", "c", "d"), setOf("c", "e", "a", "f", "d"))
        assertEquals(expected, actual)
    }
}
