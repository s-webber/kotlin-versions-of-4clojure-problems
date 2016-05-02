package kotlin4clojure.medium.happy_numbers

tailrec fun happyNumber(input: Int, previous: Set<Int> = emptySet()): Boolean {
    val sum = input.toDigits().map { it * it }.sum()
    when {
        sum == 1 -> return true
        previous.contains(sum) -> return false
        else -> return happyNumber(sum, previous + sum)
    }
}

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
