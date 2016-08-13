package kotlin4clojure.medium.power_set

fun <T> Set<T>.powerSet() =
    this.fold(setOf(emptySet<T>()), { s, e -> s + s.map { it + e } })
