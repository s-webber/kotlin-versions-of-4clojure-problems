package kotlin4clojure.medium.power_set

fun <T> powerSet(input: Set<T>) =
    input.fold(setOf(emptySet<T>()), { s, e -> s + s.map { it + e } })
