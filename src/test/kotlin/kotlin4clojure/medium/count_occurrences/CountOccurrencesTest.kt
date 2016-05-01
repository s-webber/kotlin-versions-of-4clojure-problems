package kotlin4clojure.medium.count_occurrences

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 55. Count Occurrences
 * 
 * Write a function which returns a map containing the number of occurrences of each distinct item in a list.
 */
class CountOccurrencesTest {
    @Test fun f1() {
        val expected = mapOf(1 to 4, 2 to 2, 3 to 1)
        val actual = countOccurrences(listOf(1, 1, 2, 3, 2, 1, 1))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = mapOf("a" to 2, "b" to 3)
        val actual = countOccurrences(listOf("b", "a", "b", "a", "b"))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = mapOf(Pair(1, 2) to 1, Pair(1, 3) to 2)
        val actual = countOccurrences(listOf(Pair(1, 2), Pair(1, 3), Pair(1, 3)))
        assertEquals(expected, actual)
    }
}
