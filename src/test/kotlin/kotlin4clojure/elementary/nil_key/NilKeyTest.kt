package kotlin4clojure.elementary.nil_key

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 134. A nil key
 * 
 * Write a function which, given a key and map,
 * returns true iff the map contains an entry with that key and its value is nil.
 */
class NilKeyTest {
    @Test fun f1() {
        assertTrue(nilKey("a", mapOf("a" to null, "b" to 2)))
    }

    @Test fun f2() {
        assertFalse(nilKey("b", mapOf("a" to null, "b" to 2)))
    }

    @Test fun f3() {
        assertFalse(nilKey("c", mapOf("a" to null, "b" to 2)))
    }
}
