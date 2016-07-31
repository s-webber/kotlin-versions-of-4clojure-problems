package kotlin4clojure.medium.filter_perfect_squares

fun filterPerfectSquares(input:String) =
    input.split(',').filter { 0.0 == Math.sqrt(it.toDouble()) % 1 }.joinToString(separator = ",")
