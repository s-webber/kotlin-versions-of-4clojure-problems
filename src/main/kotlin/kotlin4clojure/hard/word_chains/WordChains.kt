package kotlin4clojure.hard.word_chains

fun wordChain(input: Set<String>) =
    input.any { isChain(it, input - it) }

private fun isChain(current: String, rest: Set<String>) : Boolean =
    rest.isEmpty() || rest.any { isNeighbourly(current to it) && isChain(it, rest - it) }

private fun isNeighbourly(words: Pair<String, String>) : Boolean {
    val (first, second) = sort(words)

    return when (second.length - first.length) {
        0 -> isNeighbourlySameLength(first, second)
        1 -> isNeighbourlyDifferentLength(first, second)
        else -> false
    }
}

private fun sort(p : Pair<String, String>) =
    if (p.first.length > p.second.length) Pair(p.second, p.first) else p

private fun isNeighbourlySameLength(first: String, second: String) : Boolean {
    assert(first.length == second.length)

    var diffences = 0
    for (i in first.indices) {
        if (first[i] != second[i] && ++diffences == 2) {
            return false
        }
    }
    return true;
}

private fun isNeighbourlyDifferentLength(first: String, second: String) : Boolean {
    assert(first.length == second.length - 1)

    var diffences = 0
    for (i in first.indices) {
        if (first[i] != second[i + diffences] && ++diffences == 2) {
            return false
        }
    }
    return true
}
