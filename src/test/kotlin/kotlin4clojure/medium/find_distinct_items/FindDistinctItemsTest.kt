package kotlin4clojure.medium.find_distinct_items

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 56. Find Distinct Items
 * 
 * Write a function which removes the duplicates from a list. Order of the items must be maintained.
 */
class FindDistinctItemsTest {
    @Test fun f1() {
        assertEquals(listOf(1, 2, 3, 4), findDistinct(listOf(1, 2, 1, 3, 1, 2, 4)))
    }

    @Test fun f2() {
        assertEquals(listOf("a", "b", "c"), findDistinct(listOf("a", "a", "b", "b", "c", "c")))
    }

    @Test fun f3() {
        val expected = listOf(Pair(2, 4), Pair(1, 2), Pair(1, 3))
        val actual = findDistinct(listOf(Pair(2, 4), Pair(1, 2), Pair(1, 3), Pair(1, 3)))
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        assertEquals((0..49).toList(), findDistinct((0..49).toList()))
    }
}
