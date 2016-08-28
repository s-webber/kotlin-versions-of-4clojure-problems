package kotlin4clojure.hard.graph_tour

import kotlin4clojure.hard.graph_connectivity.graphConnectivity

fun <T> graphTour(vararg input: Pair<T, T>): Boolean {
    if (!graphConnectivity(input.toHashSet())) {
        return false
    }
    return input.filter {
        it.first != it.second
    }.fold(mapOf<T, List<T>>(), { m, p  ->
        m.append(p.first, p.second).append(p.second, p.first)
    }).map {
        it.value.size
    }.count {
        it % 2 == 1
    } < 3
}

fun <T> Map<T, List<T>>.append(k: T, v: T): Map<T, List<T>> =
    this + (k to (this[k]?.plus(v) ?: listOf(v)))
