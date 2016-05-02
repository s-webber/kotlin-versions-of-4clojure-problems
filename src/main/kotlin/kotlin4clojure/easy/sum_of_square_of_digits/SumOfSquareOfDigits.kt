package kotlin4clojure.easy.sum_of_square_of_digits

fun sumOfSquareOfDigits(input: IntRange): Int {
    return input.count(::isLessThanSumOfSquareOfDigits)
}

fun isLessThanSumOfSquareOfDigits(input: Int): Boolean {
    val sumOfSquareOfDigits = input.toDigits().map { it * it }.sum()
    return input < sumOfSquareOfDigits
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
