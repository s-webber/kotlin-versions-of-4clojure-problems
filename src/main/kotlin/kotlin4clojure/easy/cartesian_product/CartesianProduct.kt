package kotlin4clojure.easy.cartesian_product

fun <X, Y> cartesianProduct(a: Set<X>, b: Set<Y>): Set<Pair<X, Y>> {
    return a.map {
        val aValue = it
        b.map { Pair(aValue, it) }
    }.flatten().toSet()
}
