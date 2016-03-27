package kotlin4clojure.easy.comparisons

fun <T> comparison(f: (T, T) -> Boolean, a1: T, a2: T): Relationship {
    TODO("Add your solution here")
}

enum class Relationship {
    EQ, GT, LT
}
