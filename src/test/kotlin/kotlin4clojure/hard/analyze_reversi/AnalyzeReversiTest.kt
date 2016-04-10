package kotlin4clojure.hard.analyze_reversi

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.hard.analyze_reversi.Cell.*

/**
 * 124. Analyze Reversi
 * 
 * Reversi is normally played on an 8 by 8 board. In this problem, a 4 by 4 board is represented as a two-dimensional
 * list with black, white, and empty pieces represented by Cell.B, Cell.W, and Cell.E, respectively.
 * Create a function that accepts a game board and color as arguments, and returns a map of legal moves for that color.
 * Each key should be the coordinates of a legal move,
 * and its value a set of the coordinates of the pieces flipped by that move.
 *
 * Board coordinates should indicate the row followed by the column.
 * For example, [0 1] is the topmost row, second column from the left.
 */
class AnalyzeReversiTest {
    @Test fun f1() {
        val expected = mapOf(Pair(1, 3) to setOf(Pair(1, 2)),
                             Pair(0, 2) to setOf(Pair(1, 2)),
                             Pair(3, 1) to setOf(Pair(2, 1)),
                             Pair(2, 0) to setOf(Pair(2, 1)))
        val board = listOf(listOf(E, E, E, E),
                           listOf(E, W, B, E),
                           listOf(E, B, W, E),
                           listOf(E, E, E, E))
        assertEquals(expected, analyzeReversi(board, W))
    }

    @Test fun f2() {
        val expected = mapOf(Pair(3, 2) to setOf(Pair(2, 2)),
                             Pair(3, 0) to setOf(Pair(2, 1)),
                             Pair(1, 0) to setOf(Pair(1, 1)))
        val board = listOf(listOf(E, E, E, E),
                           listOf(E, W, B, E),
                           listOf(W, W, W, E),
                           listOf(E, E, E, E))
        assertEquals(expected, analyzeReversi(board, B))
    }

    @Test fun f3() {
        val expected = mapOf(Pair(0, 3) to setOf(Pair(1, 2)),
                             Pair(1, 3) to setOf(Pair(1, 2)),
                             Pair(3, 3) to setOf(Pair(2, 2)),
                             Pair(2, 3) to setOf(Pair(2, 2)))
        val board = listOf(listOf(E, E, E, E),
                           listOf(E, W, B, E),
                           listOf(W, W, B, E),
                           listOf(E, E, B, E))
        assertEquals(expected, analyzeReversi(board, W))
    }

    @Test fun f4() {
        val expected = mapOf(Pair(0, 3) to setOf(Pair(2, 1), Pair(1, 2)),
                             Pair(1, 3) to setOf(Pair(1, 2)),
                             Pair(2, 3) to setOf(Pair(2, 1), Pair(2, 2)))
        val board = listOf(listOf(E, E, W, E),
                           listOf(B, B, W, E),
                           listOf(B, W, W, E),
                           listOf(B, W, W, W))
        assertEquals(expected, analyzeReversi(board, B))
    }
}
