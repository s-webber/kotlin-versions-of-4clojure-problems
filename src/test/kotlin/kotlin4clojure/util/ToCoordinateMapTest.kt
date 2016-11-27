package kotlin4clojure.util

import org.junit.Test
import kotlin.test.assertEquals

class ToCoordinateMapTest {
    @Test fun testUniqueCharacters() {
        val input = listOf("qwe", "rty", "uio", "pas")
        val expected = mapOf(0 to 0 to 'q',
                             1 to 0 to 'w',
                             2 to 0 to 'e',
                             0 to 1 to 'r',
                             1 to 1 to 't',
                             2 to 1 to 'y',
                             0 to 2 to 'u',
                             1 to 2 to 'i',
                             2 to 2 to 'o',
                             0 to 3 to 'p',
                             1 to 3 to 'a',
                             2 to 3 to 's')
        assertEquals(expected, input.toCoordinateMap())
    }

    @Test fun testDuplicateCharacters() {
        val input = listOf("xxo", "o x")
        val expected = mapOf(0 to 0 to 'x',
                             1 to 0 to 'x',
                             2 to 0 to 'o',
                             0 to 1 to 'o',
                             1 to 1 to ' ',
                             2 to 1 to 'x')
        assertEquals(expected, input.toCoordinateMap())
    }

    @Test fun testDifferentRowLengths() {
        val input = listOf("ab", "cdefg", "hij")
        val expected = mapOf(0 to 0 to 'a',
                             1 to 0 to 'b',
                             0 to 1 to 'c',
                             1 to 1 to 'd',
                             2 to 1 to 'e',
                             3 to 1 to 'f',
                             4 to 1 to 'g',
                             0 to 2 to 'h',
                             1 to 2 to 'i',
                             2 to 2 to 'j')
        assertEquals(expected, input.toCoordinateMap())
    }
}
