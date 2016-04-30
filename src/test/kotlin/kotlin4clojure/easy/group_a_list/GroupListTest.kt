package kotlin4clojure.easy.group_a_list

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 63. Group a List
 * 
 * Given a function f and a list s, write a function which returns a map.
 * The keys should be the values of f applied to each item in s.
 * The value at each key should be a list of corresponding items in the order they appear in s.
 */
class GroupListTest {
    @Test fun f1() {
        val expected = mapOf(false to listOf(1, 3), true to listOf(6, 8))
        val actual = groupList({x -> x > 5}, listOf(1, 3, 6, 8))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = mapOf(36 to listOf(4 to 9, 6 to 6, 3 to 12), 35 to listOf(5 to 7))
        val actual = groupList({x -> x.first * x.second},
                               listOf(4 to 9, 6 to 6, 5 to 7, 3 to 12))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = mapOf(1 to listOf(listOf(1), listOf(3)),
                             2 to listOf(listOf(1, 2), listOf(2, 3)),
                             3 to listOf(listOf(1, 2, 3)))
        val actual = groupList({x -> x.size},
                               listOf(listOf(1), listOf(1, 2), listOf(3), listOf(1, 2, 3), listOf(2, 3)))
        assertEquals(expected, actual)
    }
}
