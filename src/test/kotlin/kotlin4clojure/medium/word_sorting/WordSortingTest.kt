package kotlin4clojure.medium.word_sorting

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 70. Word Sorting
 * 
 * Write a function that splits a sentence up into a sorted list of words.
 * Capitalization should not affect sort order and punctuation should be ignored.
 */
class WordSortingTest {
    @Test fun f1() {
        val expected = listOf("a", "day", "Have", "nice")
        val actual = wordSorting("Have a nice day.")
        assertEquals(expected, actual)
    }

    @Test fun f2() {
        val expected = listOf("a", "fun", "is", "Kotlin", "language")
        val actual = wordSorting("Kotlin is a fun language!.")
        assertEquals(expected, actual)
    }

    @Test fun f3() {
        val expected = listOf("fall", "follies", "foolish", "Fools", "for")
        val actual = wordSorting("Fools fall for foolish follies.")
        assertEquals(expected, actual)
    }
}
