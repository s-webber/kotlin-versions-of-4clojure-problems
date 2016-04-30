package kotlin4clojure.easy.factorial_fun

fun factorial(n: Int) = (1..n).fold(1) { a, b -> a * b }
