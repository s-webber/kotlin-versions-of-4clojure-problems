package kotlin4clojure.medium.palindromic_numbers

fun palindromicNumbers(start: Long): Sequence<Long> {
    var min = 1
    var max = min * 10
    var n = 0
    var even = false

    return generateSequence({
        if (n == max) {
            if (even) {
                min = n
                max = n * 10
            } else {
                n = min
            }
            even = !even
        }
        val s = n.toString()
        n++
        (s + (if (even) s else s.dropLast(1)).reversed()).toLong()
    }).dropWhile { it < start } // TODO remove dropWhile, set initial value of "n" to "start"
}
