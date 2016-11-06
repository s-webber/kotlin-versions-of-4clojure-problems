package kotlin4clojure.medium.count_occurrences

fun <T> countOccurrences(input: List<T>) = input.groupBy { it }.mapValues { it.value.size }
