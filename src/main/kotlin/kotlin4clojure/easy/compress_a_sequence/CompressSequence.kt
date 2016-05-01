package kotlin4clojure.easy.compress_a_sequence

fun <T : Any> compressSequence(input: Sequence<T>): Sequence<T> {
    var remaining = input

    fun next(previous: T): T? {
        remaining = remaining.dropWhile { it == previous }
        return remaining.firstOrNull()
    }

    return generateSequence(input.firstOrNull(), ::next)
}
