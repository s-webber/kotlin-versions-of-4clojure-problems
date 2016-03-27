package kotlin4clojure.hard.levenshtein_distance

import kotlin.test.assertEquals
import org.junit.Test

/**
 * 101. Levenshtein Distance
 * 
 * Given two lists x and y, calculate the Levenshtein distance of x and y,
 * i. e. the minimum number of edits needed to transform x into y. The allowed edits are:
 *
 * * insert a single item
 * * delete a single item
 * * replace a single item with another item
 *
 * WARNING: Some of the test cases may take a long time if you write an inefficient solution!
 */
class LevenshteinDistanceTest {
    @Test fun f1() {
        val arg1 = "kitten".toList()
        val arg2 = "sitting".toList()
        assertEquals(3, levenshteinDistance(arg1, arg2))
    }

    @Test fun f2() {
        val arg1 = "closure".toList()
        val arg2 = "clojure".toList()
        assertEquals(1, levenshteinDistance(arg1, arg2))
        assertEquals(1, levenshteinDistance(arg2, arg1))
    }

    @Test fun f3() {
        val arg1 = "xyx".toList()
        val arg2 = "xyyyx".toList()
        assertEquals(2, levenshteinDistance(arg1, arg2))
    }

    @Test fun f4() {
        val arg1 = "".toList()
        val arg2 = "123456".toList()
        assertEquals(6, levenshteinDistance(arg1, arg2))
    }

    @Test fun f5() {
        val arg = "clojure".toList()
        assertEquals(0, levenshteinDistance(arg, arg))
    }

    @Test fun f6() {
        val arg = "".toList()
        assertEquals(0, levenshteinDistance(arg, arg))
    }

    @Test fun f7() {
        val arg1 = listOf(1, 2, 3, 4)
        val arg2 = listOf(0, 2, 3, 4, 5)
        assertEquals(2, levenshteinDistance(arg1, arg2))
    }

    @Test fun f8() {
        val arg1 = listOf("a", "b", "c", "d")
        val arg2 = listOf("a", "d")
        assertEquals(2, levenshteinDistance(arg1, arg2))
    }

    @Test fun f9() {
        val arg1 = "ttttattttctg".toList()
        val arg2 = "tcaaccctaccat".toList()
        assertEquals(10, levenshteinDistance(arg1, arg2))
    }

    @Test fun f10() {
        val arg1 = "gaattctaatctc".toList()
        val arg2 = "caaacaaaaaattt".toList()
        assertEquals(9, levenshteinDistance(arg1, arg2))
    }
}
