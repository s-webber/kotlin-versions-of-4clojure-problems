package kotlin4clojure.easy.map_construction

fun <K, V> mapConstruction(keys: List<K>, values: List<V>): Map<K, V> {
    return keys.mapIndexed { i, k -> Pair(k, values[i]) }.toMap()
}
