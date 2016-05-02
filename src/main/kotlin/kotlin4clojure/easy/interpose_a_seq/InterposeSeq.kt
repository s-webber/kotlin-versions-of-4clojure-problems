package kotlin4clojure.easy.interpose_a_seq

fun <T: Any> interposeSeq(separator: T, input: Sequence<T>): Sequence<T> {
    var remaining = input
    var interpose = true

    fun next(): T? {
        val next = remaining.firstOrNull()
        if (next == null) {
            return null
        }

        interpose = !interpose
        if (interpose) {
            return separator
        } else {
            remaining = remaining.drop(1)
            return next
        }
    }

    return generateSequence(::next)
}
