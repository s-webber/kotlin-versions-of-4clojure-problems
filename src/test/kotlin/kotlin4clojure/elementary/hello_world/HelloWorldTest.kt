package kotlin4clojure.elementary.hello_world

import kotlin.test.assertEquals
import org.junit.Test

/**
 * #16 Hello World
 *
 * Write a function which returns a personalized greeting.
 */
class HelloWorldTest {
    @Test fun f1() {
        assertEquals("Hello, Dave!", hello("Dave"))
    }

    @Test fun f2() {
        assertEquals("Hello, Jenn!", hello("Jenn"))
    }

    @Test fun f3() {
        assertEquals("Hello, Rhea!", hello("Rhea"))
    }
}
