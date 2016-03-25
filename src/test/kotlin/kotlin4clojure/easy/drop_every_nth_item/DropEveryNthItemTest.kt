package kotlin4clojure.easy.drop_every_nth_item

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 41. Drop Every Nth Item
 * 
 * Write a function which drops every Nth item from a list.
 */
class DropEveryNthItemTest {
    @Test fun f1() {
        val expected = listOf(1, 2, 4, 5, 7, 8)
        val actual = dropEveryNth(listOf(1, 2, 3, 4, 5, 6, 7, 8), 3)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf("a", "c", "e")
        val actual = dropEveryNth(listOf("a", "b", "c", "d", "e", "f"), 2)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1, 2, 3, 5, 6)
        val actual = dropEveryNth(listOf(1, 2, 3, 4, 5, 6), 4)
        assertEquals(expected, actual)
    }
}
