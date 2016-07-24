package kotlin4clojure.medium.lazy_searching

tailrec fun lazySearching(input: List<Sequence<Int>>): Int? {
    val max = maxOrNull(input)
    return when {
        max == null -> null
        input.all { it.first() == max } -> max
        else -> lazySearching(input.map { it.dropWhile { it < max } })
    }
}

private fun maxOrNull(input: List<Sequence<Int>>): Int? {
    return input.map {
        val next = it.firstOrNull()
        if (next == null) {
            return null
        } else {
            next
        }
    }.max()
}
