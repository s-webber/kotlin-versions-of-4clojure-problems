package kotlin4clojure.util

/**
 * Returns a [Sequence] of the individual digits that this [Int] consists of.
 */
fun Int.toDigits(): Sequence<Int> {
    var n = this
    return generateSequence({
        if (n > 0) {
            val result = n % 10
            n /= 10
            result
        } else {
            null
        }
    })
}
