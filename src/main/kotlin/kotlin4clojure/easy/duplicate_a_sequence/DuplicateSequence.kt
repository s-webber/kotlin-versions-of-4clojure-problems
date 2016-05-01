package kotlin4clojure.easy.duplicate_a_sequence

fun <T: Any> duplicateSequence(input: Sequence<T>): Sequence<T> {
    var remaining = input
    var duplicate = false

    fun next(previous: T): T? {
        duplicate = !duplicate
        if (duplicate) {
            return previous
        } else {
            remaining = remaining.drop(1)
            return remaining.firstOrNull()
        }
    }

    return generateSequence(input.firstOrNull(), ::next)
}
