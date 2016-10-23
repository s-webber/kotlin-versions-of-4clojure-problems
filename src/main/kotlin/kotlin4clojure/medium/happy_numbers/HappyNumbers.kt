package kotlin4clojure.medium.happy_numbers

import kotlin4clojure.util.toDigits

tailrec fun happyNumber(input: Int, previous: Set<Int> = emptySet()): Boolean {
    val sum = input.toDigits().map { it * it }.sum()
    when {
        sum == 1 -> return true
        previous.contains(sum) -> return false
        else -> return happyNumber(sum, previous + sum)
    }
}
