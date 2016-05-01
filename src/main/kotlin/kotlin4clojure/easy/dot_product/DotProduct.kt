package kotlin4clojure.easy.dot_product

fun dotProduct(a: Array<Int>, b: Array<Int>) = a.mapIndexed { i, t -> t * b[i] }.sum()
