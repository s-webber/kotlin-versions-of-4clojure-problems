package kotlin4clojure.medium.equivalence_classes

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 98. Equivalence Classes
 * 
 * A function f defined on a domain D induces an equivalence relation on D, as follows:
 * a is equivalent to b with respect to f if and only if (f a) is equal to (f b).
 * Write a function with arguments f and D that computes the equivalence classes of D with respect to f.
 */
class EquivalenceClassesTest {
    @Test fun f1() {
        val expected = setOf(setOf(0), setOf(-1, 1), setOf(2, -2))
        val actual = equivalenceClasses({x -> x * x}, setOf(-2, -1, -0, 1, 2))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = setOf(setOf(0, 3), setOf(1, 4), setOf(2, 5))
        val actual = equivalenceClasses({x -> x % 3}, setOf(0, 1, 2, 3, 4, 5))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = setOf(setOf(0), setOf(1), setOf(2), setOf(3), setOf(4))
        val actual = equivalenceClasses({x -> x}, setOf(0, 1, 2, 3, 4))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = setOf(setOf(0, 1, 2, 3, 4))
        val actual = equivalenceClasses({x -> true}, setOf(0, 1, 2, 3, 4))
        assertEquals(expected, actual)
    }
}
