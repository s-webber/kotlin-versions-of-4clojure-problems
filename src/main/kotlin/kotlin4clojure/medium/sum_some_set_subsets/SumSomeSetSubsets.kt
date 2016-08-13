package kotlin4clojure.medium.sum_some_set_subsets

import kotlin4clojure.medium.power_set.powerSet

fun sumSomeSetSubsets(vararg input: Set<Int>): Boolean {
    input.map {
        it.powerSet()
          .filter { it.isNotEmpty() }
          .map { it.sum() }
          .toSet()
    }.reduce { a, b ->
        val intersect = a.intersect(b)
        if (intersect.isEmpty()) {
            return false
        }
        intersect
    }
    return true
}
