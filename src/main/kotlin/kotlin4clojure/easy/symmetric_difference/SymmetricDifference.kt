package kotlin4clojure.easy.symmetric_difference

fun <T> symmetricDifference(a: Set<T>, b: Set<T>) = (a + b) - a.intersect(b)
