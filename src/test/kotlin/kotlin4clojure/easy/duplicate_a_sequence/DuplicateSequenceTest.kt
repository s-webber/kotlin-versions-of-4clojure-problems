package kotlin4clojure.easy.duplicate_a_sequence

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 32. Duplicate a Sequence
 * 
 * Write a function which duplicates each element of a list.
 */
class DuplicateSequenceTest {
    @Test fun f1() {
        val expected = listOf(1, 1, 2, 2, 3, 3)
        val actual = duplicateSequence(listOf(1, 2, 3))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf("a", "a", "a", "a", "b", "b", "b", "b")
        val actual = duplicateSequence(listOf("a", "a", "b", "b"))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(Pair(1, 2), Pair(1, 2), Pair(3, 4), Pair(3, 4))
        val actual = duplicateSequence(listOf(Pair(1, 2), Pair(3, 4)))
        assertEquals(expected, actual)
    }
}
