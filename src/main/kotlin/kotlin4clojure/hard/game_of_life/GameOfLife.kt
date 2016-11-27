package kotlin4clojure.hard.game_of_life

import kotlin4clojure.util.plus
import kotlin4clojure.util.toCoordinateMap

private val LIVE_CELL = '#'

private val NEIGHBOURING_CELLS = listOf(-1 to -1, 0 to -1, 1 to -1,
                                        -1 to  0,          1 to  0,
                                        -1 to  1, 0 to  1, 1 to  1)

fun gameOfLife(input: List<String>): List<String> {
    val coordinateMap = input.toCoordinateMap()

    // Produce a set containing the coordinates of all the live cells of the next generation.
    val nextGenerationCells = coordinateMap.filter { entry ->
        val coordinate = entry.key
        val numberOfLiveNeighbours = NEIGHBOURING_CELLS.count { coordinateMap[coordinate + it] == LIVE_CELL }
        if (entry.value == LIVE_CELL) {
            // Any live cell with two or three live neighbours lives on to the next generation.
            numberOfLiveNeighbours == 2 || numberOfLiveNeighbours == 3
        } else {
            // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
            numberOfLiveNeighbours == 3
        }
    }.keys.toSet()

    return format(nextGenerationCells, input.size, input.first().length)
}

private fun format(cells: Set<Pair<Int, Int>>, width: Int, height: Int) =
    (0..height-1).map { y ->
        (0..width-1).map { x ->
            if (cells.contains(x to y)) LIVE_CELL else ' '
        }.joinToString(separator = "")
    }
