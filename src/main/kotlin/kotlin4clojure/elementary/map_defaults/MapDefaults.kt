package kotlin4clojure.elementary.map_defaults

fun <K, V> mapDefault(default: V, vararg keys:K): Map<K, V> {
    return keys.map { Pair(it, default) }.toMap()
}
