package kotlin4clojure.medium.reverse_interleave

fun <T> reverseInterleave(input: List<T>, numberOfSubLists: Int) =
    (0..numberOfSubLists - 1).map { n ->
        (0..input.size - 1 step numberOfSubLists).map {
            input[n + it]
        }.toList()
    }.toList()
