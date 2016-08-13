package kotlin4clojure.hard.transitive_closure

// TODO this is inefficient
fun <T> transitiveClosure(input: Set<Pair<T, T>>): Set<Pair<T, T>> {
    var current = input

    do {
        val size = current.size
        current.forEach { p ->
            current.forEach {
                if (it.second == p.first) {
                    current += Pair(it.first, p.second)
                }
            }
        }
    } while (current.size > size)

    return current
}
