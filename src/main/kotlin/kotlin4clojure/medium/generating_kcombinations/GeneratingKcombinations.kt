package kotlin4clojure.medium.generating_kcombinations

import kotlin4clojure.medium.power_set.powerSet

fun <T> kcombinations(k: Int, input: Set<T>) =
    input.powerSet().filter { it.size == k }.toSet()
