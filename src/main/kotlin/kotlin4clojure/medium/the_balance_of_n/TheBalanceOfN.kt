package kotlin4clojure.medium.the_balance_of_n

import kotlin4clojure.util.toDigits

fun theBalanceOfN(input: Int): Boolean {
    val digits = input.toDigits().toList()
    val middle = digits.size / 2
    val left = digits.take(middle).sum()
    val right = digits.takeLast(middle).sum()
    return left == right
}
