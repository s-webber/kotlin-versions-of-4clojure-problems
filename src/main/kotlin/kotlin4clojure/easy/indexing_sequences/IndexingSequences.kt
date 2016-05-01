package kotlin4clojure.easy.indexing_sequences

fun <T: Any> indexingSequences(input: Sequence<T>): Sequence<Pair<T, Int>> {
    return input.mapIndexed { i, t -> Pair(t, i) }
}
