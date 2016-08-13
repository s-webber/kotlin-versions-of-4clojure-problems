package kotlin4clojure.medium.prime_numbers

import java.math.BigInteger

fun primeNumbers(n: Int): List<Int> {
    val s = generateSequence(BigInteger("2"), { it.nextProbablePrime() })
    return s.take(n)
            .map { it.intValueExact() }
            .toList()
}
