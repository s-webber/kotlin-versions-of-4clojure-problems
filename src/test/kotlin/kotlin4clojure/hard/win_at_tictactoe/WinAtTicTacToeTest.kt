package kotlin4clojure.hard.win_at_tictactoe

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.hard.win_at_tictactoe.Cell.*

/**
 * 119. Win at Tic-Tac-Toe
 * 
 * A tic-tac-toe board is represented by a two dimensional array.
 * X is represented by Cell.X, O is represented by Cell.O, and empty is represented by Cell.E.
 * Create a function that accepts a game piece and board as arguments, and returns a set (possibly empty) of
 * all valid board placements of the game piece which would result in an immediate win.
 *
 * Board coordinates should indicate the row followed by the column.
 * For example, [0 1] is the topmost row, center position.
 */
class WinAtTicTacToeTest {
    @Test fun f1() {
        val board = arrayOf(arrayOf(O, E, E),
                            arrayOf(O, X, O),
                            arrayOf(X, X, E))
        val expected = setOf(Pair(2, 2), Pair(0, 1), Pair(0, 2))
        assertEquals(expected, winAtTicTacToe(X, board))
    }

    @Test fun f2() {
        val board = arrayOf(arrayOf(X, O, O),
                            arrayOf(X, X, E),
                            arrayOf(E, O, E))
        val expected = setOf(Pair(2, 2), Pair(1, 2), Pair(2, 0))
        assertEquals(expected, winAtTicTacToe(X, board))
    }

    @Test fun f3() {
        val board = arrayOf(arrayOf(X, E, X),
                            arrayOf(O, X, O),
                            arrayOf(E, O, E))
        val expected = setOf(Pair(2, 2), Pair(0, 1), Pair(2, 0))
        assertEquals(expected, winAtTicTacToe(X, board))
    }

    @Test fun f4() {
        val board = arrayOf(arrayOf(X, X, O),
                            arrayOf(E, E, E),
                            arrayOf(E, E, E))
        assertEquals(emptySet(), winAtTicTacToe(X, board))
    }

    @Test fun f5() {
        val board = arrayOf(arrayOf(X, X, O),
                            arrayOf(O, E, O),
                            arrayOf(X, E, E))
        val expected = setOf(Pair(2, 2), Pair(1, 1))
        assertEquals(expected, winAtTicTacToe(O, board))
    }
}
