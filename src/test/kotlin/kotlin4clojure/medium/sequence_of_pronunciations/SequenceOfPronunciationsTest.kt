package kotlin4clojure.medium.sequence_of_pronunciations

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 110. Sequence of pronunciations
 * 
 * Write a function that returns a lazy sequence of "pronunciations" of a sequence of numbers. A pronunciation of each
 * element in the sequence consists of the number of repeating identical numbers and the number itself. For example,
 * [1 1] is pronounced as [2 1] ("two ones"), which in turn is pronounced as [1 2 1 1] ("one two, one one").
 *
 * Your function should accept an initial sequence of numbers, and return an infinite lazy sequence of pronunciations,
 * each element being a pronunciation of the previous element.
 */
class SequenceOfPronunciationsTest {
    @Test fun f1() {
        val expected = listOf(listOf(1, 1), listOf(2, 1), listOf(1, 2, 1, 1))
        val actual = sequenceOfPronunciations(listOf(1)).take(3).toList()
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf(3, 1, 2, 4)
        val actual = sequenceOfPronunciations(listOf(1, 1, 1, 4, 4)).first()
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf(1, 1, 1, 3, 2, 1, 3, 2, 1, 1)
        val actual = sequenceOfPronunciations(listOf(1)).elementAt(6)
        assertEquals(expected, actual)
    }

    @Test fun f4() {
        val actual = sequenceOfPronunciations(listOf(3, 2)).elementAt(15).size
        assertEquals(338, actual)
    }
}
