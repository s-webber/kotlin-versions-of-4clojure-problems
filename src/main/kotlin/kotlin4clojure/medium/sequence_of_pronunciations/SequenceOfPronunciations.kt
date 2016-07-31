package kotlin4clojure.medium.sequence_of_pronunciations

fun sequenceOfPronunciations(input: List<Int>) =
    generateSequence(next(input), ::next)

fun next(input: List<Int>) =
    input.partitionBy { x, y -> x == y }.map { listOf(it.size, it.first()) }.flatten()

fun <T> List<T>.partitionBy(predicate: (T, T) -> Boolean): List<List<T>> {
    val m = mutableListOf<MutableList<T>>()
    this.forEach {
        if (m.isEmpty() || !predicate(m.last().last(), it)) {
            m.add(mutableListOf(it))
        } else {
            m.last().add(it)
        }
    }
    return m
}
