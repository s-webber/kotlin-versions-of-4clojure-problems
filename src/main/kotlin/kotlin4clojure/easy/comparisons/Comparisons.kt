package kotlin4clojure.easy.comparisons

fun <T> comparison(f: (T, T) -> Boolean, a: T, b: T): Relationship {
    TODO("Add your solution here")
}

enum class Relationship { EQ, GT, LT }
