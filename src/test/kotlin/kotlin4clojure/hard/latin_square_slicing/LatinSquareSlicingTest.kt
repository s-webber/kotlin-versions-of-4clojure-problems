package kotlin4clojure.hard.latin_square_slicing

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

import org.junit.Test

import kotlin4clojure.hard.latin_square_slicing.LatinSquareSlicingTest.Symbol.*

/**
 * 152. Latin Square Slicing
 * 
 * A Latin square of order n is an n x n array that contains n different elements,
 * each occurring exactly once in each row, and exactly once in each column.
 * For example, among the following arrays only the first one forms a Latin square:
 *
 * A B C    A B C    A B C
 * B C A    B C A    B D A
 * C A B    C A C    C A B
 *
 * Let V be a list of such lists that they may differ in length.
 * We will say that an arrangement of lists of V in consecutive rows is an alignment (of lists) of V
 * if the following conditions are satisfied:
 *
 * * All lists of V are used.
 * * Each row contains just one list.
 * * The order of V is preserved.
 * * All lists of maximal length are horizontally aligned each other.
 * * If a list is not of maximal length then all its elements are aligned with elements of some sublists
 *   of a list of maximal length.
 *
 * Let L denote a Latin square of order 2 or greater. We will say that L is included in V or that V includes L iff there exists an alignment of V such that contains a subsquare that is equal to L.
 * For example, if V equals [[1 2 3][2 3 1 2 1][3 1 2]] then there are nine alignments of V (brackets omitted):
 *
 *      1              2              3
 *
 *    1 2 3          1 2 3          1 2 3
 * A  2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
 *    3 1 2        3 1 2        3 1 2
 *
 *    1 2 3          1 2 3          1 2 3
 * B  2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
 *      3 1 2        3 1 2        3 1 2
 *
 *    1 2 3          1 2 3          1 2 3
 * C  2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
 *        3 1 2        3 1 2        3 1 2
 *
 * Alignment A1 contains Latin square [[1 2 3][2 3 1][3 1 2]], alignments A2, A3, B1, B2, B3 contain no Latin squares,
 * and alignments C1, C2, C3 contain [[2 1][1 2]]. Thus in this case V includes one Latin square of order 3 and
 * one of order 2 which is included three times.
 * Our aim is to implement a function which accepts a list of lists V as an argument,
 * and returns a set of pairs. Each pair should contain the order of a Latin square included in V,
 * and a count of different Latin squares of that order included in V.
 * If V does not include any Latin squares an empty set should be returned.
 * In the previous example the correct output of such a function is setOf{3 to 1, 2 to 1} and not setOf{3 to 1, 2 to 3}.
 */
class LatinSquareSlicingTest {
    @Test fun f1() {
        val input = listOf(listOf(A, B, C, D),
                           listOf(A, C, D, B),
                           listOf(B, A, D, C),
                           listOf(D, C, A, B))
        assertEquals(emptySet(), latinSquareSlicing(input))
    }

    @Test fun f2() {
        val expected = setOf(6 to 1)
        val input = listOf(listOf(A, B, C, D, E, F),
                           listOf(B, C, D, E, F, A),
                           listOf(C, D, E, F, A, B),
                           listOf(D, E, F, A, B, C),
                           listOf(E, F, A, B, C, D),
                           listOf(F, A, B, C, D, E))
        assertEquals(expected, latinSquareSlicing(input))
    }

    @Test fun f3() {
        val expected = setOf(4 to 1, 2 to 4)
        val input = listOf(listOf(A, B, C, D),
                           listOf(B, A, D, C),
                           listOf(D, C, B, A),
                           listOf(C, D, A, B))
        assertEquals(expected, latinSquareSlicing(input))
    }

    @Test fun f4() {
        val expected = setOf(3 to 3)
        val input = listOf(listOf(C, D, A, C, B),
                           listOf(D, A, B, C, A),
                           listOf(A, B, C, A, B),
                           listOf(B, C, A, B, C),
                           listOf(A, D, B, C, A))
        assertEquals(expected, latinSquareSlicing(input))
    }

    @Test fun f5() {
        val input = listOf(listOf(2, 4, 6, 3),
                           listOf(3, 4, 6, 2),
                           listOf(6, 2, 4))
        assertEquals(emptySet(), latinSquareSlicing(input))
    }

    @Test fun f6() {
        val expected = setOf(2 to 2)
        val input = listOf(listOf(1),
                           listOf(1, 2, 1, 2),
                           listOf(2, 1, 2, 1),
                           listOf(1, 2, 1, 2),
                           emptyList())
        assertEquals(expected, latinSquareSlicing(input))
    }

    @Test fun f7() {
        val expected = setOf(3 to 1, 2 to 2)
        val input = listOf(listOf(3, 1, 2),
                           listOf(1, 2, 3, 1, 3, 4),
                           listOf(2, 3, 1, 3))
        assertEquals(expected, latinSquareSlicing(input))
    }

    @Test fun f8() {
        val expected = setOf(4 to 1, 3 to 1, 2 to 7)
        val input = listOf(listOf(8, 6, 7, 3, 2, 5, 1, 4),
                           listOf(6, 8, 3, 7),
                           listOf(7, 3, 8, 6),
                           listOf(3, 7, 6, 8, 1, 4, 5, 2),
                           listOf(1, 8, 5, 2, 4),
                           listOf(8, 1, 2, 4, 5))
        assertEquals(expected, latinSquareSlicing(input))
    }

    /** Extra test (not on the `master` branch) added to demonstrate the behaviour of the `getSubSquarePositions` function. */
    @Test fun testGetSubSquarePositions() {
        val expected = mapOf(2 to listOf(0 to 0, 0 to 1, 1 to 0, 1 to 1, 2 to 0, 2 to 1), 3 to listOf(0 to 0, 1 to 0))
        val input = listOf(listOf(3, 1), listOf(4), listOf(2, 9, 1, 7))
        assertEquals(expected, getSubSquarePositions(input))
    }

    /** Extra test (not on the `master` branch) added to demonstrate the behaviour of the `getRowAlignments` and `permutations` functions. */
    @Test fun testGetRowAlignmentsAndPermutations() {
        val input = listOf(listOf(3, 1), listOf(4), listOf(2, 9, 1))

        val expectedAlignments =
            listOf(listOf(listOf(3, 1, null), listOf(null, 3, 1)),
                   listOf(listOf(4, null, null), listOf(null, 4, null), listOf(null, null, 4)),
                   listOf(listOf(2, 9, 1)))
        val actualAlignments = getRowAlignments(input)
        assertEquals(expectedAlignments, actualAlignments)

        val expectedPermutations =
            listOf(listOf(listOf(3, 1, null), listOf(4, null, null), listOf(2, 9, 1)),
                   listOf(listOf(3, 1, null), listOf(null, 4, null), listOf(2, 9, 1)),
                   listOf(listOf(3, 1, null), listOf(null, null, 4), listOf(2, 9, 1)),
                   listOf(listOf(null, 3, 1), listOf(4, null, null), listOf(2, 9, 1)),
                   listOf(listOf(null, 3, 1), listOf(null, 4, null), listOf(2, 9, 1)),
                   listOf(listOf(null, 3, 1), listOf(null, null, 4), listOf(2, 9, 1)))
        val actualPermutations = actualAlignments.permutations()
        assertEquals(expectedPermutations, actualPermutations)
    }

    /** Extra test (not on the `master` branch) added to demonstrate the behaviour of the `subSquare` function. */
    @Test fun testSubSquare() {
        val input = listOf(listOf(3, 1, 9, 8),
                           listOf(4, 9, 3, null),
                           listOf(2, 9, 1, 7),
                           listOf(8, 5, 3, 4))

        assertEquals(listOf(listOf(3, 1), listOf(4, 9)), subSquare(input, 0 to 0, 2))
        assertEquals(listOf(listOf(3, 1, 9), listOf(4, 9, 3), listOf(2, 9, 1)), subSquare(input, 0 to 0, 3))
        assertEquals(listOf(listOf(9, 1), listOf(5, 3)), subSquare(input, 1 to 2, 2))
        assertEquals(listOf(listOf(1, 7), listOf(3, 4)), subSquare(input, 2 to 2, 2))

        assertNull(subSquare(input, 2 to 1, 2))
        assertNull(subSquare(input, 1 to 0, 3))
        assertNull(subSquare(input, 0 to 0, 4))
    }

    /** Extra test (not on the `master` branch) added to demonstrate the behaviour of the `isLatin` function. */
    @Test fun testIsLatin() {
        assertTrue(isLatin(listOf(listOf(1, 2), listOf(2, 1))))
        assertTrue(isLatin(listOf(listOf(1,2,3), listOf(2,3,1), listOf(3,1,2))))

        assertFalse(isLatin(listOf(listOf(1, 2), listOf(1, 2))))
        assertFalse(isLatin(listOf(listOf(1, 1), listOf(2, 2))))
        assertFalse(isLatin(listOf(listOf(1, 2), listOf(3, 4))))
    }

    enum class Symbol { A, B, C, D, E, F }
}
