package kotlin4clojure.hard.graph_connectivity

fun <T> graphConnectivity(input: Set<Pair<T, T>>): Boolean {
    val sets = input.map { setOf(it.first, it.second) }
    return isConnected(sets.first(), sets.drop(1).toSet())
}

tailrec fun <T> isConnected(visited: Set<T>, rest: Set<Set<T>>): Boolean {
    if (rest.isEmpty()) {
        return true
    }

    val intersection = rest.filter { visited.containsAny(it) }
    if (intersection.isEmpty()) {
        return false
    }

    return isConnected(visited + intersection.flatten(), rest - intersection)
}

fun <T> Collection<T>.containsAny(elements: Collection<T>) = this.any { elements.contains(it) }
