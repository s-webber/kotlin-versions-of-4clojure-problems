package kotlin4clojure.hard.analyze_reversi

import kotlin4clojure.util.plus

fun analyzeReversi(board: List<List<Cell>>, player: Cell): Map<Pair<Int, Int>, Set<Pair<Int, Int>>> {
    val coords = toCoordsMap(board)
    return coords.filterValues { it == player }
                 .map { findLines(coords, it.key, it.value) }
                 .flatten()
                 .associate { it }
}

fun toCoordsMap(grid: List<List<Cell>>) =
    grid.mapIndexed { rowIdx, row -> row.mapIndexed { colIdx, t -> Pair(rowIdx to colIdx, t) } }
        .flatten()
        .associate { it }

fun findLines(coords: Map<Pair<Int, Int>, Cell>, coord: Pair<Int, Int>, cell: Cell) =
    moves.map {
        val list = findLine(coords, coord, cell, it);
        if (list.size > 1) {
            Pair(list.last(), list.dropLast(1).toSet())
        } else {
            null
        }
    }.filterNotNull()

tailrec fun findLine(coords: Map<Pair<Int, Int>, Cell>, coord: Pair<Int, Int>, cell: Cell, move: Pair<Int, Int>, line: List<Pair<Int, Int>> = emptyList()): List<Pair<Int, Int>> {
    val next = coord + move
    return when (coords[next]) {
        null -> emptyList()
        cell -> emptyList()
        Cell.E -> line + next
        else -> findLine(coords, next, cell, move, line + next)
    }
}

val moves = listOf(1 to 0, 1 to 0, 1 to 1, 0 to 1, 1 to -1, -1 to 0, -1 to -1, 0 to -1, -1 to 1)

enum class Cell {
    E, B, W
}
