package kotlin4clojure.hard.analyze_a_tictactoe_board

import kotlin.test.assertEquals
import org.junit.Test

import kotlin4clojure.hard.analyze_a_tictactoe_board.Cell.*

/**
 * 73. Analyze a Tic-Tac-Toe Board
 * 
 * A tic-tac-toe board is represented by a two dimensional array.
 * X is represented by Cell.X, O is represented by Cell.O, and empty is represented by Cell.E.
 * A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row.
 * Write a function which analyzes a tic-tac-toe board and returns X if X has won, O if O has won,
 * and E if neither player has won.
 */
class AnalyzeTicTacToeBoardTest {
    @Test fun f1() {
        assertEquals(E, determineWinner(arrayOf(arrayOf(E, E, E),
                                                arrayOf(E, E, E),
                                                arrayOf(E, E, E))))
    }

    @Test fun f2() {
        assertEquals(X, determineWinner(arrayOf(arrayOf(X, E, O),
                                                arrayOf(X, E, E),
                                                arrayOf(X, E, O))))
    }

    @Test fun f3() {
        assertEquals(O, determineWinner(arrayOf(arrayOf(E, X, E),
                                                arrayOf(O, O, O),
                                                arrayOf(X, E, X))))
    }

    @Test fun f4() {
        assertEquals(E, determineWinner(arrayOf(arrayOf(X, E, O),
                                                arrayOf(X, X, E),
                                                arrayOf(O, E, O))))
    }

    @Test fun f5() {
        assertEquals(X, determineWinner(arrayOf(arrayOf(X, E, E),
                                                arrayOf(O, X, E),
                                                arrayOf(O, E, X))))
    }

    @Test fun f6() {
        assertEquals(O, determineWinner(arrayOf(arrayOf(X, E, O),
                                                arrayOf(X, O, E),
                                                arrayOf(O, E, X))))
    }

    @Test fun f7() {
        assertEquals(E, determineWinner(arrayOf(arrayOf(X, O, X),
                                                arrayOf(X, O, X),
                                                arrayOf(O, X, O))))
    }
}
