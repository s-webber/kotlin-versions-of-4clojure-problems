package kotlin4clojure.hard.for_science

fun forScience(vararg input: String): Boolean {
    val cells = input.mapIndexed { rowIdx, line ->
        line.mapIndexed { colIdx, cell ->
            Pair(colIdx to rowIdx, cell)
        }
    }.flatten().toMap()
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
    moves.map { Pair(cell.first + it.first, cell.second + it.second) }

val moves = listOf(Pair(0, 1), Pair(0, -1), Pair(1, 0), Pair(-1, 0))
