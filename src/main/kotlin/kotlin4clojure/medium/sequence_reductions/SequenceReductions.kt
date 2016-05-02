package kotlin4clojure.medium.sequence_reductions

fun <T: Any> sequenceReductions(f: (T, T) -> T, input: Sequence<T>): Sequence<T> {
    return sequenceReductions(f, input.first(), input.drop(1))
}

fun <R: Any, A> sequenceReductions(f: (R, A) -> R, start: R, input: Sequence<A>): Sequence<R> {
    var remaining = input

    fun next(previous: R): R? {
        val next = remaining.firstOrNull()
        if (next == null) {
            return null
        } else {
            remaining = remaining.drop(1)
            return f.invoke(previous, next)
        }
    }

    return generateSequence(start, ::next)
}
