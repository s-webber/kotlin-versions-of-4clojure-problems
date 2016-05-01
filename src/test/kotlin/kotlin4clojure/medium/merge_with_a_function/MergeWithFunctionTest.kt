package kotlin4clojure.medium.merge_with_a_function

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 69. Merge with a Function
 * 
 * Write a function which takes a function f and a variable number of maps.
 * Your function should return a map that consists of the rest of the maps conj-ed onto the first.
 * If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the
 * mapping in the result by calling f(val-in-result val-in-latter)
 */
class MergeWithFunctionTest {
    @Test fun f1() {
        val expected = mapOf("a" to 4, "b" to 6, "c" to 20)
        fun f(x: Int, y: Int) = x * y
        val m1 =  mapOf("a" to 2, "b" to 3, "c" to 4)
        val m2 = mapOf("a" to 2)
        val m3 = mapOf("b" to 2)
        val m4 = mapOf("c" to 5)
        val actual = mergeWithFunction(::f, m1, m2, m3, m4)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = mapOf(1 to 7, 2 to 10, 3 to 15)
        fun f(x: Int, y: Int) = x - y
        val m1 = mapOf(1 to 10, 2 to 20)
        val m2 = mapOf(1 to 3, 2 to 10, 3 to 15)
        val actual = mergeWithFunction(::f, m1, m2)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = mapOf("a" to listOf(3, 4, 5), "b" to listOf(6, 7), "c" to listOf(8, 9))
        fun f(x: List<Int>, y: List<Int>) = x + y
        val m1 = mapOf("a" to listOf(3), "b" to listOf(6))
        val m2 = mapOf("a" to listOf(4, 5), "c" to listOf(8, 9))
        val m3 = mapOf("b" to listOf(7))
        val actual = mergeWithFunction(::f, m1, m2, m3)
        assertEquals(expected, actual)
    }
}
