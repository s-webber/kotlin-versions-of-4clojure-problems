package kotlin4clojure.medium.the_balance_of_n

fun theBalanceOfN(input: Int): Boolean {
    val digits = input.toDigits().toList()
    val middle = digits.size / 2
    val left = digits.take(middle).sum()
    val right = digits.takeLast(middle).sum()
    return left == right
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
