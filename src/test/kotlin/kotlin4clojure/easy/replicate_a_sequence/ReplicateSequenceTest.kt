package kotlin4clojure.easy.replicate_a_sequence

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 33. Replicate a Sequence
 * 
 * Write a function which replicates each element of a sequence a variable number of times.
 */
class ReplicateSequenceTest {
    @Test fun f1() {
        val expected = listOf(1, 1, 2, 2, 3, 3)
        val actual = replicateSequence(sequenceOf(1, 2, 3), 2).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf("a", "a", "a", "a", "b", "b", "b", "b")
        val actual = replicateSequence(sequenceOf("a", "b"), 4).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(4, 5, 6)
        val actual = replicateSequence(sequenceOf(4, 5, 6), 1).toList()
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = listOf(1 to 2, 1 to 2, 3 to 4, 3 to 4)
        val actual = replicateSequence(sequenceOf(1 to 2, 3 to 4), 2).toList()
        assertEquals(expected, actual)
    }

    @Test fun f5() {
        val expected = listOf(44, 44, 33, 33)
        val actual = replicateSequence(sequenceOf(44, 33), 2).toList()
        assertEquals(expected, actual)
    }
}
