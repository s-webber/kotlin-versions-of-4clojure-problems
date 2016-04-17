package kotlin4clojure.easy.compress_a_sequence

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 30. Compress a Sequence
 * 
 * Write a function which removes consecutive duplicates from a sequence.
 */
class CompressSequenceTest {
    @Test fun f1() {
        val expected = "Leroy".asSequence()
        val input = "Leeeeeerrroyyy".asSequence()
        assertEquals(expected, compressSequence(input))
    }

    @Test fun f2() {
        val expected = sequenceOf(1, 2, 3, 2, 3)
        val input = sequenceOf(1, 1, 2, 3, 3, 2, 2, 3)
        assertEquals(expected, compressSequence(input))
    }

    @Test fun f3() {
        val expected = sequenceOf(1 to 2, 3 to 4, 1 to 2)
        val input = sequenceOf(1 to 2, 1 to 2, 3 to 4, 1 to 2)
        assertEquals(expected, compressSequence(input))
    }
}
