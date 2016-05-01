package kotlin4clojure.medium.count_occurrences

fun <T> countOccurrences(input: List<T>): Map<T, Int> {
    return input.groupBy { it }.mapValues { it.value.size }
}
