package kotlin4clojure.medium.the_big_divide

import java.math.BigInteger

private val TWO = BigInteger("2")

fun bigDivide(maxExclusive: BigInteger, a: BigInteger, b: BigInteger): BigInteger {
    val maxInclusive = maxExclusive - BigInteger.ONE
    val sumDivisibleByA = sumDivisible(maxInclusive, a)
    val sumDivisibleByB = sumDivisible(maxInclusive, b)
    val sumDivisibleByBoth = sumDivisible(maxInclusive, a * b)
    return (sumDivisibleByA + sumDivisibleByB) - sumDivisibleByBoth
}

// calculates the sum of all natural numbers <= max (first argument)
// which are evenly divisible by the coprime n (second argument).
fun sumDivisible(max: BigInteger, n: BigInteger) =
    ((max / n) * ((max - max.mod(n)) + n)) / TWO
