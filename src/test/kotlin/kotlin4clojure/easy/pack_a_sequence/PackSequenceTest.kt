package kotlin4clojure.easy.pack_a_sequence

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 31. Pack a Sequence
 * 
 * Write a function which packs consecutive duplicates into sub-lists.
 */
class PackSequenceTest {
    @Test fun f1() {
        val expected = listOf(listOf(1, 1), listOf(2), listOf(1, 1, 1), listOf(3, 3))
        val actual = packSequence(sequenceOf(1, 1, 2, 1, 1, 1, 3, 3)).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(listOf("a", "a"), listOf("b", "b"), listOf("c"))
        val actual = packSequence(sequenceOf("a", "a", "b", "b", "c")).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(listOf(1 to 2, 1 to 2), listOf(3 to 4))
        val actual = packSequence(sequenceOf(1 to 2, 1 to 2, 3 to 4)).toList()
        assertEquals(expected, actual)
    }
}
