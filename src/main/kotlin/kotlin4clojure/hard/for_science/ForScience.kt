package kotlin4clojure.hard.for_science

import kotlin4clojure.util.plus
import kotlin4clojure.util.toCoordinateMap

fun forScience(vararg input: String): Boolean {
    val cells = input.toList().toCoordinateMap()
    val mouses = cells.filterValues { it == 'M' }.keys.toSet()
    val cheeses = cells.filterValues { it == 'C' }.keys.toSet()
    val empty = cells.filterValues { it == ' ' }.keys.toSet()
    return isConnected(mouses, emptySet(), empty + cheeses, cheeses)
}

 tailrec fun isConnected(toVisit: Set<Pair<Int, Int>>,
                         visited: Set<Pair<Int, Int>>,
                         visitable: Set<Pair<Int, Int>>,
                         goal: Set<Pair<Int, Int>>): Boolean {
    val next = toVisit.firstOrNull()
    return when {
        next == null -> false
        goal.contains(next) -> true
        else -> {
            val newToVisit = (adjacent(next) - visited).intersect(visitable)
            isConnected(toVisit - next + newToVisit, visited + next, visitable, goal)
        }
    }
}

fun adjacent(cell: Pair<Int, Int>) =
    moves.map { cell + it }

val moves = listOf(Pair(0, 1), Pair(0, -1), Pair(1, 0), Pair(-1, 0))
