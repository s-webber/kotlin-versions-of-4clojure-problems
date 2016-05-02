package kotlin4clojure.easy.sum_of_square_of_digits

fun sumOfSquareOfDigits(input: IntRange): Int {
    return input.count(::isLessThanSumOfSquareOfDigits)
}

fun isLessThanSumOfSquareOfDigits(input: Int): Boolean {
    val sumOfSquareOfDigits = toDigits(input).map { it * it }.sum()
    return input < sumOfSquareOfDigits
}

fun toDigits(input: Int): Sequence<Int> {
    var n = input
    return generateSequence({
        if (n > 0) {
            val result = n % 10
            n = n / 10
            result
        } else {
            null
        }
    })
}
