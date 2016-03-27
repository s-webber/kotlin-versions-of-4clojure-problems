package kotlin4clojure.easy.indexing_sequences

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 157. Indexing Sequences
 * 
 * Transform a array into an array of pairs containing the original elements along with their index.
 */
class IndexingSequencesTest {
    @Test fun f1() {
        val expected = arrayOf("a" to 0, "b" to 1, "c" to 2)
        val actual = indexingSequences("a", "b", "c")
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = arrayOf(0 to 0, 1 to 1, 3 to 2)
        val actual = indexingSequences(0, 1, 3)
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = arrayOf(listOf("foo") to 0, mapOf("bar" to "baz") to 1)
        val actual = indexingSequences(listOf("foo"), mapOf("bar" to "baz"))
        assertEquals(expected, actual)
    }
}
