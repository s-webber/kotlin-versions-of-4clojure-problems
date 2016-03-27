package kotlin4clojure.elementary.map_defaults

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 156. Map Defaults
 *
 * Write a function which takes a default value and an array of keys and constructs a map.
 */
class MapDefaultsTest {
    @Test fun f1() {
        assertEquals(mapOf("a" to 0, "b" to 0, "c" to 0), mapDefault(0, "a", "b", "c"))
    }

    @Test fun f2() {
        assertEquals(mapOf(1 to "x", 2 to "x", 3 to "x"), mapDefault("x", 1, 2, 3))
    }

    @Test fun f3() {
        val default = listOf("a", "b")
        assertEquals(mapOf("foo" to default, "bar" to default), mapDefault(default, "foo", "bar"))
    }
}
