package kotlin4clojure.medium.equivalence_classes

fun <X, Y> equivalenceClasses(f: (X) -> Y, input: Set<X>) =
     input.groupBy(f)
          .mapValues { it.value.toSet() }
          .values
          .toSet()
