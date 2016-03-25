package kotlin4clojure.hard.word_chains

import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.Test

/**
 * 82. Word Chains
 * 
 * A word chain consists of a set of words ordered so that each word differs by only one letter from the words directly
 * before and after it. The one letter difference can be either an insertion, a deletion, or a substitution.
 * Here is an example word chain:
 *
 * cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog
 *
 * Write a function which takes a set of words,
 * and returns true if they can be arranged into one continuous word chain, and false if they cannot.
 */
class WordChainsTest {
    @Test fun f1() {
        assertTrue(wordChain(setOf("hat", "coat", "dog", "cat", "oat", "cot", "hot", "hog")))
    }

    @Test fun f2() {
        assertFalse(wordChain(setOf("cot", "hot", "bat", "fat")))
    }

    @Test fun f3() {
        assertFalse(wordChain(setOf("to", "top", "stop", "tops", "toss")))
    }

    @Test fun f4() {
        assertTrue(wordChain(setOf("spout", "do", "pot", "pout", "spot", "dot")))
    }

    @Test fun f5() {
        assertTrue(wordChain(setOf("share", "hares", "shares", "hare", "are")))
    }

    @Test fun f6() {
        assertFalse(wordChain(setOf("share", "hares", "hare", "are")))
    }
}
