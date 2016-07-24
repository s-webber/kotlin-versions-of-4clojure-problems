package kotlin4clojure.medium.partition_a_list

fun <T> partitionList(size: Int, input: List<T>): Sequence<List<T>> {
    var remaining = input

    fun next() : List<T>? {
        if (remaining.size < size) {
            return null
        } else {
            val result = remaining.take(size)
            remaining = remaining.drop(size)
            return result
        }
    }

    return generateSequence(::next)
}
