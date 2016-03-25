package kotlin4clojure.medium.intocamelcase

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 102. intoCamelCase
 * 
 * Write a function which takes lower-case hyphen-separated strings and converts them to camel-case strings.
 */
class IntoCamelCaseTest {
    @Test fun f1() {
        assertEquals("something", intoCamelCase("something"))
    }

    @Test fun f2() {
        assertEquals("multiWordKey", intoCamelCase("multi-word-key"))
    }

    @Test fun f3() {
        assertEquals("leaveMeAlone", intoCamelCase("leaveMeAlone"))
    }
}
