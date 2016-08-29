package kotlin4clojure.hard.analyze_a_tictactoe_board

import kotlin4clojure.hard.analyze_a_tictactoe_board.Cell.*

val lines = listOf(listOf(0 to 0, 0 to 1, 0 to 2),
                   listOf(1 to 0, 1 to 1, 1 to 2),
                   listOf(2 to 0, 2 to 1, 2 to 2),
                   listOf(0 to 0, 1 to 0, 2 to 0),
                   listOf(0 to 1, 1 to 1, 2 to 1),
                   listOf(0 to 2, 1 to 2, 2 to 2),
                   listOf(0 to 0, 1 to 1, 2 to 2),
                   listOf(0 to 2, 1 to 1, 2 to 0))

fun determineWinner(board: Array<Array<Cell>>): Cell {
    lines.map {
        it.map { board[it.first][it.second] }
    }.forEach {
        if (it.all { it == X }) {
            return X
        }
        if (it.all { it == O }) {
            return O
        }
    }
    return E
}

enum class Cell {
    E, X, O
}
