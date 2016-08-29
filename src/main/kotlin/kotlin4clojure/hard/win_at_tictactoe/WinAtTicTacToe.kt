package kotlin4clojure.hard.win_at_tictactoe

import kotlin4clojure.hard.analyze_a_tictactoe_board.Cell
import kotlin4clojure.hard.analyze_a_tictactoe_board.lines

fun winAtTicTacToe(player: Cell, board: Array<Array<Cell>>): Set<Pair<Int, Int>> {
    return lines.map {
        it.map { it to board[it.first][it.second] }
    }.map {
        it.groupBy { it.second }
    }.map {
        val numPlayersCells = it[player]?.size ?: 0
        val emptyCell = it[Cell.E]?.first()
        if (numPlayersCells == 2 && emptyCell != null) {
            emptyCell.first
        } else {
            null
        }
    }.filterNotNull().toSet()
}
