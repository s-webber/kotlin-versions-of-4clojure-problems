package kotlin4clojure.medium.partition_a_list

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 54. Partition a List
 * 
 * Write a function which returns a list of lists of x items each. Lists of less than x items should not be returned.
 */
class PartitionListTest {
    @Test fun f1() {
        val expected = listOf(listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8))
        val actual = partitionList(3, 0..8)
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(listOf(0, 1), listOf(2, 3), listOf(4, 5), listOf(6, 7))
        val actual = partitionList(2, 0..7)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(listOf(0, 1, 2), listOf(3, 4, 5))
        val actual = partitionList(3, 0..7)
        assertEquals(expected, actual)
    }
}
