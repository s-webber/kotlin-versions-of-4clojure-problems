package kotlin4clojure.easy.duplicate_a_sequence

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 32. Duplicate a Sequence
 * 
 * Write a function which duplicates each element of a sequence.
 */
class DuplicateSequenceTest {
    @Test fun f1() {
        val expected = listOf(1, 1, 2, 2, 3, 3)
        val actual = duplicateSequence(sequenceOf(1, 2, 3)).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf("a", "a", "a", "a", "b", "b", "b", "b")
        val actual = duplicateSequence(sequenceOf("a", "a", "b", "b")).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1 to 2, 1 to 2, 3 to 4, 3 to 4)
        val actual = duplicateSequence(sequenceOf(1 to 2, 3 to 4)).toList()
        assertEquals(expected, actual)
    }
}
