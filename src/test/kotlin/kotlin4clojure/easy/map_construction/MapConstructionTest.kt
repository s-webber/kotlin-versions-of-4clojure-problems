package kotlin4clojure.easy.map_construction

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 61. Map Construction
 * 
 * Write a function which takes a list of keys and a list of values and constructs a map from them.
 */
class MapConstructionTest {
    @Test fun f1() {
        val expected = mapOf("a" to 1, "b" to 2, "c" to 3)
        assertEquals(expected, mapConstruction(listOf("a", "b", "c"), listOf(1, 2, 3)))
    }

    @Test fun f2() {
        val expected = mapOf(1 to "one", 2 to "two", 3 to "three")
        assertEquals(expected, mapConstruction(listOf(1, 2, 3), listOf("one", "two", "three")))
    }

    @Test fun f3() {
        val expected = mapOf(":foo" to "foo", ":bar" to "bar")
        assertEquals(expected, mapConstruction(listOf(":foo", ":bar"), listOf("foo", "bar", "baz")))
    }
}
