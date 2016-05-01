package kotlin4clojure.easy.replicate_a_sequence

fun <T: Any> replicateSequence(input: Sequence<T>, n: Int): Sequence<T> {
    var remaining = input
    var duplicateCtr = 0

    fun next(previous: T): T? {
        duplicateCtr++
        if (duplicateCtr < n) {
            return previous
        } else {
            duplicateCtr = 0
            remaining = remaining.drop(1)
            return remaining.firstOrNull()
        }
    }

    return generateSequence(input.firstOrNull(), ::next)
}
