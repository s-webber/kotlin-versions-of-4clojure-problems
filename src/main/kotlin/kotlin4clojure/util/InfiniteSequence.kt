package kotlin4clojure.util

/**
 * Returns an infinite [Sequence] of [Int] elements.
 *
 * @param start the first value to be returned by the sequence. By default `0`.
 */
fun infiniteSequence(start: Int = 0) = generateSequence(start, {it + 1})
