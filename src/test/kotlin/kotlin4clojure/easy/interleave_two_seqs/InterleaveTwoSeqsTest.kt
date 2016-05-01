package kotlin4clojure.easy.interleave_two_seqs

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 39. Interleave Two Seqs
 * 
 * Write a function which takes two sequences and returns the first item from each,
 * then the second item from each, then the third, etc.
 */
class InterleaveTwoSeqsTest {
    @Test fun f1() {
        val expected = listOf<Any>(1, 'a', 2, 'b', 3, 'c')
        val actual = interleaveTwoSequences(sequenceOf(1, 2, 3), sequenceOf('a', 'b', 'c')).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(1, 3 ,2, 4)
        val actual = interleaveTwoSequences(sequenceOf(1, 2), sequenceOf(3, 4, 5, 6)).toList()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1, 5)
        val actual = interleaveTwoSequences(sequenceOf(1, 2, 3, 4), sequenceOf(5)).toList()
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val expected = listOf(30, 25, 20, 15)
        val actual = interleaveTwoSequences(sequenceOf(30, 20), sequenceOf(25, 15)).toList()
        assertEquals(expected, actual)
    }
}
