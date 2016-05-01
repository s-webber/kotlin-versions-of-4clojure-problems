package kotlin4clojure.medium.global_takewhile

fun <T: Any> globalTakeWhile(n: Int, predicate: (T) -> Boolean, input: List<T>): Sequence<T> {
    var remaining = input
    var matches = 0

    fun next(): T? {
        val next = remaining.firstOrNull()
        if (next == null) {
            return null
        } else {
            if (predicate.invoke(next)) {
                matches++
            }

            if (matches < n) {
                remaining = remaining.drop(1)
                return next
            } else {
                return null
            }
        }
    }

    return generateSequence(::next)
}
