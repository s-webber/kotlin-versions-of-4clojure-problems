package kotlin4clojure.hard.crossword_puzzle

fun crosswordPuzzle(word: String, grid: List<String>) : Boolean {
    val filteredGrid = grid.map { it.filter { it != ' ' } }
    return fitsAny(filteredGrid, word) || fitsAny(rotate(filteredGrid), word)
}

fun fitsAny(board: List<String>, word: String) =
    board.map{ it.split("#") }.flatten().any { fits(it, word) }

fun fits(line: String, word: String) =
    line.length == word.length && (0..word.length - 1).all { line[it] == '_' || line[it] == word[it] }

fun rotate(grid: List<String>) =
    (0..grid.first().length - 1).map {
        val idx = it;
        grid.map { it[idx] }
    }.map { it.joinToString("") }
