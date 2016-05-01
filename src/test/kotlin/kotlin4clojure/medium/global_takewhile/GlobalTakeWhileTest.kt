package kotlin4clojure.medium.global_takewhile

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 114. Global take-while
 * 
 * Write a function which accepts an integer n, a predicate p, and a list.
 * It should return a lazy sequence of items in the list up to, but not including,
 * the nth item that satisfies the predicate.
 */
class GlobalTakeWhileTest {
    @Test fun f1() {
        val expected = listOf(2, 3, 5, 7, 11, 13)
        val actual = globalTakeWhile(4, {x -> (x %3) == 2}, listOf(2, 3, 5, 7, 11, 13, 17, 19, 23))
        assertEquals(expected, actual.toList())
    }

    @Test fun f2() {
        val expected = listOf("this", "is", "a", "sentence")
        val actual = globalTakeWhile(3, {x -> x.contains('i')}, listOf("this", "is", "a", "sentence", "i", "wrote"))
        assertEquals(expected, actual.toList())
    }

    @Test fun f3() {
        val expected = listOf("this", "is")
        val actual = globalTakeWhile(1, {x -> x.equals("a")}, listOf("this", "is", "a", "sentence", "i", "wrote"))
        assertEquals(expected, actual.toList())
    }
}
