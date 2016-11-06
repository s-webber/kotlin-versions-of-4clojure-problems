package kotlin4clojure.medium.sequence_reductions

fun <T: Any> sequenceReductions(f: (T, T) -> T, input: Sequence<T>) =
    sequenceReductions(f, input.first(), input.drop(1))

fun <R: Any, A> sequenceReductions(f: (R, A) -> R, start: R, input: Sequence<A>): Sequence<R> {
    var remaining = input

    return generateSequence(start, { previous ->
        val next = remaining.firstOrNull()
        if (next == null) {
            null
        } else {
            remaining = remaining.drop(1)
            f.invoke(previous, next)
        }
    })
}
