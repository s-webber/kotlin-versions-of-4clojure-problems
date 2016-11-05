package kotlin4clojure.easy.pack_a_sequence

fun <T: Any> packSequence(input: Sequence<T>): Sequence<List<T>> {
    var remaining = input

    return generateSequence {
        val value = remaining.firstOrNull()
        if (value == null) {
            null
        } else {
            val result = remaining.takeWhile { it == value }.toList()
            remaining = remaining.drop(result.size)
            result
        }
    }
}
