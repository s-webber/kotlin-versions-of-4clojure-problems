package kotlin4clojure.hard.transitive_closure

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 84. Transitive Closure
 * 
 * Write a function which generates the transitive closure of a binary relation.
 */
class TransitiveClosureTest {
    @Test fun f1() {
        val expected = setOf(4 to 2, 8 to 4, 8 to 2, 9 to 3, 27 to 9, 27 to 3)
        val divides = setOf(8 to 4, 9 to 3, 4 to 2, 27 to 9)
        assertEquals(expected, transitiveClosure(divides))
    }

    @Test fun f2() {
        val expected = setOf("cat" to "man", "cat" to "snake", "man" to "snake",
                             "spider" to "cat", "spider" to "man", "spider" to "snake")
        val moreLegs = setOf("cat" to "man", "man" to "snake", "spider" to "cat")
        assertEquals(expected, transitiveClosure(moreLegs))
    }

    @Test fun f3() {
        val expected = setOf("father" to "son", "father" to "grandson", "uncle" to "cousin", "son" to "grandson")
        val progeny = setOf("father" to "son", "uncle" to "cousin", "son" to "grandson")
        assertEquals(expected, transitiveClosure(progeny))
    }
}
