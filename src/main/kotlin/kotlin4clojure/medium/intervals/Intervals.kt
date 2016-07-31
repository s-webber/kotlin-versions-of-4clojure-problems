package kotlin4clojure.medium.intervals

fun intervals(input: List<Int>): Sequence<Pair<Int, Int>> {
    var remaining = input.sorted()
    return generateSequence({
        if (remaining.isEmpty()) {
            null
        } else {
            var previous = remaining.first()
            val interval = remaining.takeWhile {
                if (previous + 1 >= it) {
                    previous = it
                    true
                } else {
                    false
                }
            }
            remaining = remaining.drop(interval.size)

            Pair(interval.first(), interval.last())
        }
    })
}
