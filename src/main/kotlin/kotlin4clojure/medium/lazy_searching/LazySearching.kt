package kotlin4clojure.medium.lazy_searching

tailrec fun lazySearching(input: List<Sequence<Int>>): Int? {
    val max = maxOrNull(input)
    return when {
        max == null -> null
        input.all { it.first() == max } -> max
        else -> lazySearching(input.map { it.dropWhile { it < max } })
    }
}

private fun maxOrNull(input: List<Sequence<Int>>) =
    input.map { it.firstOrNull() ?: return null }.max()
