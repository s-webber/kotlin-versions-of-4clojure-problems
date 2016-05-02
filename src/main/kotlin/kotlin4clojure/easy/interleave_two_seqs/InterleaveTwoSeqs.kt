package kotlin4clojure.easy.interleave_two_seqs

fun <T: Any> interleaveTwoSequences(a: Sequence<T>, b: Sequence<T>): Sequence<T> {
    var remainingA = a
    var remainingB = b
    var selectFromA = false

    fun next(): T? {
        selectFromA = !selectFromA

        val nextB = remainingB.firstOrNull()

        if (selectFromA && nextB != null) {
            val nextA = remainingA.firstOrNull()
            remainingA = remainingA.drop(1)
            return nextA
        } else {
            remainingB = remainingB.drop(1)
            return nextB
        }
    }

    return generateSequence(::next)
}
