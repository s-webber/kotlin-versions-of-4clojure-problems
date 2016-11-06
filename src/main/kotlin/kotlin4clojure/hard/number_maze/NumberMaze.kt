package kotlin4clojure.hard.number_maze

fun numberMaze(start: Int, end: Int): Int = if (start == end) 1 else numberMaze(setOf(start), end, 1)

tailrec fun numberMaze(input: Set<Int?>, target: Int, ctr: Int): Int {
    val next = input.map(::next).flatten().toSet()
    if (next.any { it == target }) {
        return ctr + 1
    } else {
        return numberMaze(next, target, ctr + 1)
    }
}

fun next(i: Int?) = if (i==null) emptyList() else functions.map { it.invoke(i) }

val functions = listOf(::double, ::half, ::add2)

fun double(i: Int) = i * 2

fun half(i: Int) = if (i % 2 == 0) i / 2 else null

fun add2(i: Int) = i + 2
