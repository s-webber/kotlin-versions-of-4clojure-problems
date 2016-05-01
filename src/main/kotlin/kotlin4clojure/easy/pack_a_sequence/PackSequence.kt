package kotlin4clojure.easy.pack_a_sequence

fun <T: Any> packSequence(input: Sequence<T>): Sequence<List<T>> {
    var remaining = input

    fun next(): List<T>? {
        val value = remaining.firstOrNull()
        if (value == null) {
            return null
        } else {
            val result = remaining.takeWhile { it == value }.toList()
            remaining = remaining.drop(result.size)
            return result
        }
    }

    return generateSequence(::next)
}
