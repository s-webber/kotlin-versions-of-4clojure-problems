package kotlin4clojure.medium.palindromic_numbers

fun palindromicNumbers(start: Long): Sequence<Long> {
    var max = Math.pow(start.toString().length.toDouble(), 10.0).toLong() * 10
    var even = start.toString().isEven()
    var n = startValue(start)

    return generateSequence({
        if (n == max) {
            if (even) {
                max = n * 10
            } else {
                n = max / 10
            }
            even = !even
        }
        val s = n.toString()
        n++
        (s + (if (even) s else s.dropLast(1)).reversed()).toLong()
    })
}

private fun startValue(start: Long) : Long {
    val s = start.toString()
    val endPoint = if (s.isEven()) s.length / 2 else s.length / 2 + 1
    val n = s.substring(0, endPoint).toLong()
    return if (n < s.reversed().substring(0, endPoint).toLong()) {
        n + 1
    } else {
        n
    }
}

fun String.isEven() = this.length % 2 == 0
