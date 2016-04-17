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
        val expected = sequenceOf(1, 1, 2, 2, 3, 3)
        val actual = duplicateSequence(sequenceOf(1, 2, 3))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = sequenceOf("a", "a", "a", "a", "b", "b", "b", "b")
        val actual = duplicateSequence(sequenceOf("a", "a", "b", "b"))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = sequenceOf(1 to 2, 1 to 2, 3 to 4, 3 to 4)
        val actual = duplicateSequence(sequenceOf(1 to 2, 3 to 4))
        assertEquals(expected, actual)
    }
}
