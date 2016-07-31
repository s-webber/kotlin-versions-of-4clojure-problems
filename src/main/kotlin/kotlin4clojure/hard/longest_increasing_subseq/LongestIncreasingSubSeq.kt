package kotlin4clojure.hard.longest_increasing_subseq

fun longestIncreasingSubSeq(input: List<Int>): List<Int> {
    var longestSubSeq = largest(
        input.fold(Pair(emptyList<Int>(), emptyList<Int>()), { s, e ->
            if (s.second.isEmpty() || s.second.last() == e - 1) {
                Pair(s.first, s.second + e)
            } else {
                Pair(largest(s), listOf(e))
            }
        })
     )

    return if (longestSubSeq.size > 1) longestSubSeq else emptyList()
}

fun <T> largest(p: Pair<List<T>, List<T>>) = if (p.first.size >= p.second.size) p.first else p.second
