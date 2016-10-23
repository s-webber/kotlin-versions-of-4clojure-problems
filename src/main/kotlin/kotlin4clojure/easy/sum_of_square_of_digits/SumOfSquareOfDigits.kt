package kotlin4clojure.easy.sum_of_square_of_digits

import kotlin4clojure.util.toDigits

fun sumOfSquareOfDigits(input: IntRange): Int {
    return input.count(::isLessThanSumOfSquareOfDigits)
}

fun isLessThanSumOfSquareOfDigits(input: Int): Boolean {
    val sumOfSquareOfDigits = input.toDigits().map { it * it }.sum()
    return input < sumOfSquareOfDigits
}
