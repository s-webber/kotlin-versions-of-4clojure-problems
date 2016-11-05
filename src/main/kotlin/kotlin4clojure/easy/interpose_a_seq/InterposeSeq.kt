package kotlin4clojure.easy.interpose_a_seq

fun <T: Any> interposeSeq(separator: T, input: Sequence<T>): Sequence<T> {
    var remaining = input
    var interpose = true

    return generateSequence {
        val next = remaining.firstOrNull()
        if (next == null) {
            null
        } else {
            interpose = !interpose
            if (interpose) {
                separator
            } else {
                remaining = remaining.drop(1)
                next
            }
        }
    }
}
