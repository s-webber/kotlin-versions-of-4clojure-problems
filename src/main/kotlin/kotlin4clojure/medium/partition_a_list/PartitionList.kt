package kotlin4clojure.medium.partition_a_list

fun <T> partitionList(size: Int, input: List<T>): Sequence<List<T>> {
    var remaining = input

    return generateSequence {
        if (remaining.size < size) {
            null
        } else {
            val result = remaining.take(size)
            remaining = remaining.drop(size)
            result
        }
    }
}
