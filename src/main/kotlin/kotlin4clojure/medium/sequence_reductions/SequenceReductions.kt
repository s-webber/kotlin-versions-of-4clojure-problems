package kotlin4clojure.medium.sequence_reductions

fun <T: Any> sequenceReductions(f: (T, T) -> T, input: Sequence<T>): Sequence<T> {
    return sequenceReductions(f, input.first(), input.drop(1))
}

fun <R: Any, A> sequenceReductions(f: (R, A) -> R, start: R, input: Sequence<A>): Sequence<R> {
    TODO("Add your solution here")
}
