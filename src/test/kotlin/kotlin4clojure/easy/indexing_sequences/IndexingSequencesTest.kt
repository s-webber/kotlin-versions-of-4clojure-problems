package kotlin4clojure.easy.indexing_sequences

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 157. Indexing Sequences
 * 
 * Transform a sequence into a sequence of pairs containing the original elements along with their index.
 */
class IndexingSequencesTest {
    @Test fun f1() {
        val expected = sequenceOf("a" to 0, "b" to 1, "c" to 2)
        val actual = indexingSequences(sequenceOf("a", "b", "c"))
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = sequenceOf(0 to 0, 1 to 1, 3 to 2)
        val actual = indexingSequences(sequenceOf(0, 1, 3))
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = sequenceOf(listOf("foo") to 0, mapOf("bar" to "baz") to 1)
        val actual = indexingSequences(sequenceOf(listOf("foo"), mapOf("bar" to "baz")))
        assertEquals(expected, actual)
    }
}
