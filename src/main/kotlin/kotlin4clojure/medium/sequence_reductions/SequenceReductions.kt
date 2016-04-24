package kotlin4clojure.medium.sequence_reductions

fun <T> sequenceReductions(f: (T, T) -> T, input: Sequence<T>): Sequence<T> {
    return sequenceReductions(f, input.first(), input.drop(1))
}

fun <R, A> sequenceReductions(f: (R, A) -> R, start: R, input: Sequence<A>): Sequence<R> {
    TODO("Add your solution here")
}
