package kotlin4clojure.easy.get_the_caps

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 29. Get the Caps
 * 
 * Write a function which takes a string and returns a new string containing only the capital letters.
 */
class GetTheCapsTest {
    @Test fun f1() {
        assertEquals("HLOWRD", getCaps("HeLlO, WoRlD!"))
    }

    @Test fun f2() {
        assertEquals("", getCaps("nothing"))
    }

    @Test fun f3() {
        assertEquals("AZ", getCaps("$#A(*&987Zf"))
    }
}
