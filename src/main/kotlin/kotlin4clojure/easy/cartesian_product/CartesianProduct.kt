package kotlin4clojure.easy.cartesian_product

fun <X, Y> cartesianProduct(a: Set<X>, b: Set<Y>) =
    a.map {
        aValue -> b.map { Pair(aValue, it) }
    }.flatten().toSet()
