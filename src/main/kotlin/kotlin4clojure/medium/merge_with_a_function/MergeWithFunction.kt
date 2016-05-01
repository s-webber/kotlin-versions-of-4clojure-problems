package kotlin4clojure.medium.merge_with_a_function

fun <K, V> mergeWithFunction(f: (V, V) -> V, vararg maps: Map<K, V>) : Map<K, V> {
    return maps.reduce { a, b ->
        (a.keys + b.keys).map {
            val aValue = a[it]
            val bValue = b[it]
            val combinedValue = when {
                aValue == null -> bValue!!
                bValue == null -> aValue
                else -> f.invoke(aValue, bValue)
            }
            Pair(it, combinedValue)
        }.toMap()
    }
}
