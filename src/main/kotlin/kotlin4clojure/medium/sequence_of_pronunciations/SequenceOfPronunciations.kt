package kotlin4clojure.medium.sequence_of_pronunciations

fun sequenceOfPronunciations(input: List<Int>) =
    generateSequence(next(input), ::next)

fun next(input: List<Int>) =
    input.partitionBy { x, y -> x == y }.map { listOf(it.size, it.first()) }.flatten()

fun <T> List<T>.partitionBy(predicate: (T, T) -> Boolean): List<List<T>> {
    return this.fold(mutableListOf<MutableList<T>>(), { s, e ->
        if (s.isEmpty() || !predicate(s.last().last(), e)) {
            s.add(mutableListOf(e))
        } else {
            s.last().add(e)
        }
        s
    })
}
