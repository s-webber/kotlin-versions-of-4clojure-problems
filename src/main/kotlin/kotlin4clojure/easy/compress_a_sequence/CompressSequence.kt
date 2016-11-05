package kotlin4clojure.easy.compress_a_sequence

fun <T : Any> compressSequence(input: Sequence<T>): Sequence<T> {
    var remaining = input

    return generateSequence(input.firstOrNull(), { previous ->
        remaining = remaining.dropWhile { it == previous }
        remaining.firstOrNull()
    })
}
