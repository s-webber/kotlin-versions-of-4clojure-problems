package kotlin4clojure.medium.anagram_finder

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 77. Anagram Finder
 * 
 * Write a function which finds all the anagrams in a vector of words.
 * A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y.
 * Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other.
 * Each sub-set should have at least two words. Words without any anagrams should not be included in the result.
 */
class AnagramFinderTest {
    @Test fun f1() {
        assertEquals(setOf(setOf("meat", "team", "mate")),
                     anagrams("meat", "mat", "team", "mate", "eat"))
    }

    @Test fun f2() {
        assertEquals(setOf(setOf("veer", "ever"), setOf("lake", "kale"), setOf("mite", "item")),
                     anagrams("veer", "lake", "item", "kale", "mite", "ever"))
    }
}
