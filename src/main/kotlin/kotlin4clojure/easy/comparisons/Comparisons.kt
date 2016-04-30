package kotlin4clojure.easy.comparisons

import kotlin4clojure.easy.comparisons.Relationship.*

fun <T> comparison(f: (T, T) -> Boolean, a: T, b: T) = when {
    f(a, b) -> LT
    f(b, a) -> GT
    else -> EQ
}

enum class Relationship { EQ, GT, LT }
