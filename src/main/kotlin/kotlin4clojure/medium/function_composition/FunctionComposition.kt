package kotlin4clojure.medium.function_composition

operator fun <X, Y, Z> Function1<X, Y>.plus(y: (Y) -> Z): (X) -> Z = { y.invoke(this.invoke(it)) }
